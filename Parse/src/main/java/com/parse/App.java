package org.apache.cordova.core;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class App extends Application {


    private static Context mContext;
    private static App sInstance = null;

    public static App getInstance() {
        return sInstance;
    }

    public static Context getContext() {
        //  return instance.getApplicationContext();
        return mContext;
    }




    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        Log.w("init","initialize parse with application");
        ParsePlugin.initializeParseWithApplication(this);
    }
}
