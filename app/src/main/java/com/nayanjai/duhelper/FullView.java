package com.nayanjai.duhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class FullView extends AppCompatActivity {

    WebView webView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        Intent intent = getIntent();

        String url = intent.getStringExtra("url");


        //CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        //CustomTabsIntent customTabsIntent = builder.build();
        //customTabsIntent.launchUrl(this, Uri.parse(url));

       // builder.setToolbarColor(ContextCompat.getColor(this, R.color.primary));


        webView = findViewById(R.id.syl_webview);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.clearCache(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(url);
                return true;
            }
        });

        webView.loadUrl(url);


    }


}