package com.jangphong.hem.karbicalender2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jangphong.hem.karbicalender2.adapters.ListAdapter;
import com.jangphong.hem.karbicalender2.helperclass.AlarmReceiver;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.ArrayList;

public class ReminderList extends AppCompatActivity {

    FloatingActionButton fab;
    DatabaseHelper myDB;
    ArrayList<Item> reminderList;
    RecyclerView recyclerListView;
    Item item;
    ListAdapter adapter;
    ImageView topBackBtn;
    RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder_list);

        fab = findViewById(R.id.add_reminder);
        topBackBtn = findViewById(R.id.backBtn);
        myDB = new DatabaseHelper(this);
        mRelativeLayout = findViewById(R.id.relativeLayoutParent);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ReminderList.this, Reminder.class);
                startActivity(intent);
            }
        });

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        reminderList = new ArrayList<>();

            recyclerListView = findViewById(R.id.recyclerListView);
            recyclerListView.setLayoutManager(new LinearLayoutManager(this));
            adapter = new ListAdapter(this, R.layout.reminder_list_model, reminderList, mRelativeLayout);
            recyclerListView.setAdapter(adapter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        reminderList.clear();
    }

    @Override
    protected void onResume() {
        super.onResume();
        final Cursor data = myDB.getListContents();
        int numRows = data.getCount();

        if (numRows != 0){
            while (data.moveToNext()) {
                item = new Item(data.getString(1), data.getString(2), data.getString(3), data.getInt(4));
                reminderList.add(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
