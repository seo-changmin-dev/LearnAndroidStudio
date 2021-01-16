package com.scmdev.kotlinfunclass;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastUtilJava {

    public static void toastShort(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static void toastLong(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

    public static void toast(String message, int length) {
        Toast.makeText(MainApplication.getAppContext(), message, length).show();
    }
    //overloading
    public static void toast(String message) {
        toast(message, Toast.LENGTH_SHORT);
    }
}
