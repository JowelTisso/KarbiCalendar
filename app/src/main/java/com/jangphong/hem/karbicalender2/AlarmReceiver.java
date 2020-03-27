package com.jangphong.hem.karbicalender2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        int notificationId = intent.getIntExtra("notificationId", 0);
        String message = intent.getStringExtra("todo");

        //This is the code for when notification is tapped, to call an Activity(Main Activity)
        Intent mainIntent = new Intent(context, ReminderList.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, mainIntent, 0);

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        Notification.Builder builder = new Notification.Builder(context);
        long[] pattern = {500, 500, 500, 500, 500, 500, 500, 500, 500, 500};
        builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_karbi_launcher))
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Reminder")
                .setContentText(message)
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .setPriority(Notification.PRIORITY_MAX)
                .setSound(alarmSound)
                .setVibrate(pattern)
                .setOnlyAlertOnce(true);


        notificationManager.notify(notificationId, builder.build());


    }
}
