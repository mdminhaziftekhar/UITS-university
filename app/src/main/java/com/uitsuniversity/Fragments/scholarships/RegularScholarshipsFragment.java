package com.uitsuniversity.Fragments.scholarships;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.uitsuniversity.R;
import com.uitsuniversity.WebViewController;

public class RegularScholarshipsFragment extends Fragment {
    public RegularScholarshipsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_regular_scholarships, container, false);

        WebView webView = view.findViewById(R.id.webview_regular_waiver);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // for javascript support
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.loadUrl("https://uits.edu.bd/scholarships-and-financial-aid/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}