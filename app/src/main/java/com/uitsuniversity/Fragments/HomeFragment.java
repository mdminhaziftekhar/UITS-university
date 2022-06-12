package com.uitsuniversity.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.uitsuniversity.R;
import com.uitsuniversity.WebViewController;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        WebView webView = view.findViewById(R.id.webview_home);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true); // for javascript support
        webView.loadUrl("https://uits.edu.bd/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}