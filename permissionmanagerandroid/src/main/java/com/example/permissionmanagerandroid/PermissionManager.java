package com.example.permissionmanagerandroid;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.Toast;

import java.security.Permission;

public class PermissionManager {
    private static final String TAG = "PermissionManager";

    public static void requestPermission(Context context,String[] Permissoins,Boolean RR){
        int[] x=new int[Permissoins.length];
        for(int i=0;i<Permissoins.length;i++){
            x[i]= ActivityCompat.checkSelfPermission(context, Permissoins[i]);

        }
        for(int i=0;i<x.length;i++){
            Activity activity = (Activity) context;
            if(x[i]!= PackageManager.PERMISSION_GRANTED){
                Log.d(TAG, "requestPermission: "+ Permissoins[i]);
                ActivityCompat.requestPermissions(activity, Permissoins, 1);


            }
        }
    }

}
