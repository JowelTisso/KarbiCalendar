package com.jangphong.hem.karbicalender2.adapters;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.jangphong.hem.karbicalender2.Item;
import com.jangphong.hem.karbicalender2.R;
import com.jangphong.hem.karbicalender2.helperclass.AlarmReceiver;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private Context mContext;
    private int mResourceId;
    private ArrayList<Item> listItems;
    private RelativeLayout mRelativeLayout;

    public ListAdapter(Context context, int resourceId, ArrayList<Item> listItems, RelativeLayout relativeLayout) {
        this.mContext = context;
        this.mResourceId = resourceId;
        this.listItems = listItems;
        this.mRelativeLayout = relativeLayout;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView event;
        TextView time;
        TextView date;
        Button btnDelete;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            event = itemView.findViewById(R.id.eventView);
            time = itemView.findViewById(R.id.timeView);
            date = itemView.findViewById(R.id.dateView);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(mResourceId,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final Item item = listItems.get(position);
        holder.event.setText(item.getEvent());
        holder.date.setText(item.getDate());
        holder.time.setText(item.getTime());
        final DatabaseHelper myDB = new DatabaseHelper(mContext);
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(mContext);
                alertBuilder.setTitle("Delete");
                final int uid = item.getUniqueId();
                alertBuilder.setMessage("Are You Sure ?");
                final String positionToRemove = item.getEvent();
                alertBuilder.setNegativeButton("Cancel",null);
                alertBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Integer deleteRow = myDB.deleteData(positionToRemove);
                        if (deleteRow > 0){
                            Intent intent = new Intent(mContext, AlarmReceiver.class);
                            PendingIntent alarmIntent = PendingIntent.getBroadcast(mContext, uid, intent, PendingIntent.FLAG_ONE_SHOT);
                            AlarmManager alarmManager = (AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
                            assert alarmManager != null;
                            alarmManager.cancel(alarmIntent);

                            listItems.remove(position);
                            notifyDataSetChanged();

                            Snackbar.make(mRelativeLayout,"Done",Snackbar.LENGTH_SHORT).show();
                        }
                    }
                });
                alertBuilder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

}
