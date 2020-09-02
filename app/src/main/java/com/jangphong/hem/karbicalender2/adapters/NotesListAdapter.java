package com.jangphong.hem.karbicalender2.adapters;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.jangphong.hem.karbicalender2.Item;
import com.jangphong.hem.karbicalender2.NotesActivity;
import com.jangphong.hem.karbicalender2.R;
import com.jangphong.hem.karbicalender2.StoredNotesDisplayActivity;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.ArrayList;

public class NotesListAdapter extends RecyclerView.Adapter<NotesListAdapter.MyViewHolder> {

    private Context mContext;
    private int mResource;
    private ArrayList<Item> mNotesList, mIdList;
    private LinearLayout mLinearLayout;
    private Activity mActivity;

    public NotesListAdapter(Context context, int resource, ArrayList<Item> notesList, LinearLayout linearLayout, ArrayList<Item> idList, Activity activity) {
        this.mContext = context;
        this.mResource = resource;
        this.mNotesList = notesList;
        this.mLinearLayout = linearLayout;
        this.mIdList = idList;
        this.mActivity = activity;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView noteTitle;
        TextView noteDate;
        Button btnNoteDelete;
        LinearLayout clickableNotesLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitle = itemView.findViewById(R.id.titleView);
            noteDate = itemView.findViewById(R.id.dateViewNotes);
            btnNoteDelete = itemView.findViewById(R.id.btnNoteDelete);
            clickableNotesLayout = itemView.findViewById(R.id.clickableNotes);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(mResource,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Item item = mNotesList.get(position);
        holder.noteTitle.setText(item.getNotesTitle());
        holder.noteDate.setText(item.getNotesDate());
        final DatabaseHelper myDB = new DatabaseHelper(mContext);
        holder.btnNoteDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(mContext);
                alertBuilder.setTitle("Delete?");

                final Item itemCall = mNotesList.get(position);// Most Important to get the list of array stored in ArrayList<Item> by clicking the  position

                alertBuilder.setMessage("Are You Sure You Wanna Delete? ");
                final String positionToRemove = itemCall.getNotesTitle(); // To get the event name from the item class which has the data

                alertBuilder.setNegativeButton("Cancel", null);
                alertBuilder.setPositiveButton("Ok", new AlertDialog.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Integer deletedRows = myDB.deleteDataFromNotes(positionToRemove);
                        if (deletedRows > 0) {
                            mNotesList.remove(position);
                            Snackbar.make(mLinearLayout,"Done",Snackbar.LENGTH_SHORT).show();
                            notifyDataSetChanged();
                        } else
                            Snackbar.make(mLinearLayout,"Failed",Snackbar.LENGTH_SHORT).show();

                    }
                });
                alertBuilder.show();

            }
        });

        holder.clickableNotesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = mNotesList.get(position);
                Item idx = mIdList.get(position);

                Intent i = new Intent(mContext, StoredNotesDisplayActivity.class);

                i.putExtra("notesKey", item.getNotes());
                i.putExtra("titleKey", item.getNotesTitle());
                i.putExtra("dateKey", item.getNotesDate());
                i.putExtra("idKey", idx.getId());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNotesList.size();
    }

}
