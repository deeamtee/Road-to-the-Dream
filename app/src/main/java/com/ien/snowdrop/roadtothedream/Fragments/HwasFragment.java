package com.ien.snowdrop.roadtothedream.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ien.snowdrop.roadtothedream.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HwasFragment extends Fragment {


    public HwasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_shop, container, false);
        //Находим WebView и загружаем что-нибудь
        WebView webView = (WebView)v.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://hardworkandsweat.com/");

//Метод должен возвращать View
        return v;
    }
    }

