package com.example.rumpilstilstkin.materialtestapp;


import android.app.Application;
import com.crashlytics.android.answers.Answers;
import io.fabric.sdk.android.Fabric;


public class MaterialApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Answers());
    }
}
