package com.example.permissionmanagerandroid;

import android.content.Context;
import android.widget.Toast;

public class PermissionManager {
    public static void Testing(String s, Context context){
        Toast.makeText(context, ""+s, Toast.LENGTH_SHORT).show();
    }
}
