package com.uitsuniversity;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewController extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.startsWith("intent:")) //this is for the messenger functionality in app
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.me/theuits/"));
            view.getContext().startActivity(i);
        }
        else{
            view.loadUrl(url);
        }
        return true;
    }

}
