package com.blogspot.yourfavoritekaisar.learnfragmentimastudio.ui.fragment;


import android.app.ProgressDialog;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.blogspot.yourfavoritekaisar.learnfragmentimastudio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {
    WebView webview;

    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        webview = view.findViewById(R.id.wv_Nyoba);
        String url = "https://www.instagram.com/ammaralghifary/";
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(true);
        progressDialog.show();



        // TODO Handling webview when error
        webview.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressDialog.dismiss();
            }

            // TODO saat error
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);

                Toast.makeText(getContext(), errorCode, Toast.LENGTH_SHORT).show();
            }
        });

        webview.loadUrl(url);
    }
}
