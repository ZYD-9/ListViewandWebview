package com.example.webthreedroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class htmlActivity extends AppCompatActivity {

   private  WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
   webview = (WebView) findViewById(R.id.web1);
   webview.setWebViewClient(new WebViewClient());

   webview.loadUrl("https://www.w3schools.com/html/default.asp");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
         if(webview.canGoBack()){
            webview.goBack();
         }
         else{
             super.onBackPressed();
         }
    }
}