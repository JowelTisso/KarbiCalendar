package com.jangphong.hem.karbicalender2.helperclass;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

import androidx.annotation.NonNull;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String s) {
        Log.i("onNewToken", "onNewToken: "+ s);
    }
}
