package com.example.android.installcatcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class InstallationNotifier extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("INSTALLATION_FLAG", "App " + intent.getAction().toString());
        String packageName = intent.getData().getEncodedSchemeSpecificPart();
        Toast.makeText(context, packageName + " " + intent.getAction().toString() + "ed!!!!.", Toast.LENGTH_LONG).show();
    }

}
