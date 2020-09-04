package com.jangphong.hem.karbicalender2;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.jangphong.hem.karbicalender2.helperclass.AlarmReceiver;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.Calendar;
import java.util.StringTokenizer;

public class Reminder extends AppCompatActivity {

    private int notificationId = 1;
    SharedPreferences sharedPreferences;
    public static final String MyPreferences = "MyPrefs";
    public static final String KEY = "Key";
    String timeStore, dateStore;
    DatabaseHelper myDB;
    String format;
    ImageView topBackBtn;
    RelativeLayout mRelativeLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        final EditText editText = findViewById(R.id.input);
        final EditText datePopup = findViewById(R.id.datetxt);
        final EditText timePopup = findViewById(R.id.timetxt);
        final Button set_btn = findViewById(R.id.set_btn);
        Button cancel_btn = findViewById(R.id.cancel_btn);
        myDB = new DatabaseHelper(this);
        topBackBtn = findViewById(R.id.backBtn);
        mRelativeLayout = findViewById(R.id.relativeLayoutReminder);

        timeStore = timePopup.getText().toString();
        dateStore = datePopup.getText().toString();

        sharedPreferences = getApplicationContext().getSharedPreferences(MyPreferences, MODE_PRIVATE);

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        datePopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentDate = Calendar.getInstance();
                int year = mcurrentDate.get(Calendar.YEAR);
                int month = mcurrentDate.get(Calendar.MONTH);
                int date = mcurrentDate.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog mDatePicker = new DatePickerDialog(Reminder.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int selectedyear, int selectedmonth, int selectedday) {
                        selectedmonth = selectedmonth + 1;
                        datePopup.setText(selectedday + "-" + selectedmonth + "-" + selectedyear);
                        dateStore = datePopup.getText().toString();
                    }
                }, year, month, date);
                mDatePicker.setTitle("Select Date");
                mDatePicker.show();

                SharedPreferences.Editor editor2 = sharedPreferences.edit();
                editor2.putString(KEY, dateStore);
                editor2.commit();
            }
        });

        timePopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int min = mcurrentTime.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(Reminder.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMin) {

                        int twelveHour = selectedHour;

                        if (twelveHour == 0) {

                            twelveHour += 12;

                            format = "AM";
                        } else if (twelveHour == 12) {

                            format = "PM";

                        } else if (twelveHour > 12) {

                            twelveHour -= 12;

                            format = "PM";

                        } else {

                            format = "AM";
                        }

                        String min;
                        if (selectedMin < 10) {
                            min = "0" + selectedMin;
                        } else
                            min = String.valueOf(selectedMin);

                        timePopup.setText(twelveHour + ":" + min + ":" + format);
                        timeStore = timePopup.getText().toString() + ":" + selectedHour;
                    }
                }, hour, min, false);
                timePicker.setTitle("Select Time");
                timePicker.show();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY, timeStore);
                editor.commit();

            }


        });

        set_btn.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {

                Intent intent = new Intent(Reminder.this, AlarmReceiver.class);
                intent.putExtra("notificationId", notificationId);
                intent.putExtra("todo", editText.getText().toString());
                final AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);
                final int id = (int) System.currentTimeMillis();

                final PendingIntent alarmIntent = PendingIntent.getBroadcast(Reminder.this, id, intent, PendingIntent.FLAG_ONE_SHOT);

                StringTokenizer st = new StringTokenizer(timeStore, ":");
                StringTokenizer stday = new StringTokenizer(dateStore, "-");
                if (st.hasMoreElements() && stday.hasMoreElements()) {

                    String hour = st.nextToken();
                    String minute = st.nextToken();
                    String am_pm = st.nextToken();
                    String actualTimeSettingHour = st.nextToken();
                    String day = stday.nextToken();
                    String month = stday.nextToken();
                    String year = stday.nextToken();

                    Calendar startTime = Calendar.getInstance();
                    startTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(actualTimeSettingHour));
                    startTime.set(Calendar.MINUTE, Integer.parseInt(minute));
                    startTime.set(Calendar.SECOND, 0);
                    startTime.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
                    startTime.set(Calendar.MONTH, Integer.parseInt(month) - 1);
                    startTime.set(Calendar.YEAR, Integer.parseInt(year));

                    long alarmStartTime = startTime.getTimeInMillis();
                    alarm.set(AlarmManager.RTC_WAKEUP, alarmStartTime, alarmIntent);

                    //This code is for checking full time including zone

                    Snackbar.make(mRelativeLayout,"Reminder Added",Snackbar.LENGTH_SHORT).show();

                    String eventText = editText.getText().toString();
                    String timeText = timePopup.getText().toString();
                    String dateText = datePopup.getText().toString();

                    if (eventText.length() != 0 && timeText.length() != 0 && dateText.length() != 0) {
                        AddData(eventText, timeText, dateText, id);

                    } else {
                        Snackbar.make(mRelativeLayout,"Field is Empty",Snackbar.LENGTH_SHORT).show();

                    }
                } else {
                    Snackbar.make(mRelativeLayout,"Field is Empty",Snackbar.LENGTH_SHORT).show();

                }
            }
        });

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reminder.this, AlarmReceiver.class);
                final AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);
                final PendingIntent alarmIntent = PendingIntent.getBroadcast(Reminder.this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

                assert alarm != null;
                alarm.cancel(alarmIntent);
                Snackbar.make(mRelativeLayout,"Cancelled",Snackbar.LENGTH_SHORT).show();
            }
        });

    }
    public void AddData(String event2, String time2, String date2, int uid) {
        boolean insertData = myDB.addData(event2, time2, date2, uid);

        if (insertData) {
            Snackbar.make(mRelativeLayout,"Data entered successfully",Snackbar.LENGTH_SHORT).show();

        } else {
            Snackbar.make(mRelativeLayout,"Something went wrong!",Snackbar.LENGTH_SHORT).show();
        }

    }

}
