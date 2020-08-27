package com.jangphong.hem.karbicalender2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jangphong.hem.karbicalender2.Item;
import com.jangphong.hem.karbicalender2.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Item> {


    private Context mContext;
    int mResource;

    public ListAdapter( Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String event = getItem(position).getEvent();
        String time = getItem(position).getTime();
        String date = getItem(position).getDate();
        int uniqueId = getItem(position).getUniqueId();

       // Item item = new Item(event,time,date,uniqueId);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView evnt = convertView.findViewById(R.id.eventView);
        TextView tme = convertView.findViewById(R.id.timeView);
        TextView dte = convertView.findViewById(R.id.dateView);

        evnt.setText(event);
        tme.setText(time);
        dte.setText(date);



        return convertView;
    }


}
