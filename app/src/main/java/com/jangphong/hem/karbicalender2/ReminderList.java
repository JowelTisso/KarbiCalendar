package com.jangphong.hem.karbicalender2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReminderList extends AppCompatActivity {

    FloatingActionButton fab;
    DatabaseHelper myDB;
    ArrayList<Item> reminderList;
    ListView listView;
    Item item;
    ListAdapter adapter;
    ImageView topBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder_list);

        fab = findViewById(R.id.add_reminder);
        topBackBtn = findViewById(R.id.backBtn);
        myDB = new DatabaseHelper(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ReminderList.this, Reminder.class);
                startActivity(intent);
                finish();

            }
        });

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        reminderList = new ArrayList<>();
        final Cursor data = myDB.getListContents();
        int numRows = data.getCount();

        if (numRows == 0) {
            Toast.makeText(ReminderList.this, "Empty Database ", Toast.LENGTH_SHORT).show();
        } else {
            while (data.moveToNext()) {
                item = new Item(data.getString(1), data.getString(2), data.getString(3), data.getInt(4));
                reminderList.add(item);


            }

            adapter = new ListAdapter(this, R.layout.reminder_list_model, reminderList);
            listView = findViewById(R.id.listView);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {

                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(ReminderList.this);
                    alertBuilder.setTitle("Delete?");

                    final Item itemCall = reminderList.get(position);// Most Important to get the list of array stored in ArrayList<Item> by clicking the  position

                    final int uid = itemCall.getUniqueId();

                    alertBuilder.setMessage("Are You Sure You Wanna Delete? ");
                    final String positionToRemove = itemCall.getEvent(); // To get the event name from the item class which has the data


                    alertBuilder.setNegativeButton("Cancel", null);
                    alertBuilder.setPositiveButton("Ok", new AlertDialog.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                            Integer deletedRows = myDB.deleteData(positionToRemove);
                            if (deletedRows > 0) {


                                Intent intent = new Intent(ReminderList.this, AlarmReceiver.class);
                                PendingIntent alarmIntent = PendingIntent.getBroadcast(ReminderList.this, uid, intent, PendingIntent.FLAG_ONE_SHOT);
                                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                                alarmManager.cancel(alarmIntent);

                                Toast.makeText(ReminderList.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                                finish();
                                overridePendingTransition(0, 0);
                                startActivity(getIntent());
                            } else
                                Toast.makeText(ReminderList.this, "Data Not Deleted", Toast.LENGTH_SHORT).show();


                        }
                    });
                    alertBuilder.show();

                }
            });


        }


    }
}
