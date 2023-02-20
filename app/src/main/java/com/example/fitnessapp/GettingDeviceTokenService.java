package com.example.fitnessapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class GettingDeviceTokenService extends FirebaseMessagingService {

    String TAG = "MyFirebaseInstanceIdService";

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("DEVICE_TOKEN", token);
    }
}