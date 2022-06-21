package com.uitsuniversity.Fragments.admission;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.uitsuniversity.R;
import com.uitsuniversity.WebViewController;

public class ApplyOnlineFragment extends Fragment {

    public ApplyOnlineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply_online, container, false);

        WebView webView = view.findViewById(R.id.webview_apply_online);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // for javascript support
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.loadUrl("http://admission.uits.edu.bd/Admission/Home");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}