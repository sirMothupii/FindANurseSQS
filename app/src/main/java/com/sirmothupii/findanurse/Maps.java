package com.sirmothupii.findanurse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Maps extends AppCompatActivity
{
    //Declaring the mapIntent variable
    Intent mapIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        //search for hospitals nearby
        Uri hospitalIntentUri = Uri.parse("geo:0,0?q=Hospital");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, hospitalIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    /*    //web view intent
        Uri uri = Uri.parse("https://www.googlemaps.com/clinic");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        //the web view layout
        WebView webview = new WebView(this);
        setContentView(webview);

        //load the desired web page:

        // Simplest usage: note that an exception will NOT be thrown
        // if there is an error loading this page (see below).
        webview.loadUrl("https://www.https://www.googlemaps.com/clinic/");

        // Let's display the progress in the activity title bar, like the
        // browser app does.
        getWindow().requestFeature(Window.FEATURE_PROGRESS);

        webview.getSettings().setJavaScriptEnabled(true);

        final Activity activity = this;
        webview.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView view, int progress)
            {
                // Activities and WebViews measure progress with different scales.
                // The progress meter will automatically disappear when we reach 100%
                activity.setProgress(progress * 1000);
            }
        });
        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, "web could not be displayed! " + description, Toast.LENGTH_SHORT).show();
            }
        });

        webview.loadUrl("https://https://www.googlemaps.com/clinic/");
    }*/
    }
}
