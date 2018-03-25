package com.example.xyzreader.remote;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.xyzreader.ui.ArticleListActivity;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {

        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error


            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }


}
