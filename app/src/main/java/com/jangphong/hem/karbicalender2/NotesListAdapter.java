package com.jangphong.hem.karbicalender2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NotesListAdapter extends ArrayAdapter<Item> {

    private Context mContext;
    int mResource;

    public NotesListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);

        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        String date = getItem(position).getNotesDate();
        String notes = getItem(position).getNotes();
        String title = getItem(position).getNotesTitle();


        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView date2 = convertView.findViewById(R.id.dateViewNotes);
        //TextView notes2 = convertView.findViewById(R.id.timeView);
        TextView title2 = convertView.findViewById(R.id.titleView);

        date2.setText(date);
        //notes2.setText(notes);
        title2.setText(title);


        return convertView;
    }
}
