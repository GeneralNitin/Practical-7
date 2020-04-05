package com.nitin.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(context.WIFI_SERVICE);
        assert wifiManager != null;
        int wifiState = wifiManager.getWifiState();
        if (wifiState == WifiManager.WIFI_STATE_ENABLED) {
            Toast.makeText(context, "Wifi enabled", Toast.LENGTH_LONG).show();
        } else if(wifiState == WifiManager.WIFI_STATE_DISABLED) {
            Toast.makeText(context, "Wifi disabled", Toast.LENGTH_LONG).show();
        }
    }
}
