package com.example.simulation.mysummary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
WebView wv;
EditText A;
EditText B;
EditText C;
String a,b,c;
String url="https://www.google.com/search?ei=pANSXImfIqbksAeEg4b4Cw&q=3x%5E2%2B2x%2B5&oq=3x%5E2%2B2x%2B5&gs_l=psy-ab.3..0i203l2j0i30l8.4915.16278..17206...2.0..0.130.1324.0j11......0....1..gws-wiz.....6..0i71j0i7i30j35i39j0i131j0j0i67.cwSKBFjRUbM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
        A=(EditText)findViewById(R.id.A);
        B=(EditText)findViewById(R.id.B);
        C=(EditText)findViewById(R.id.C);

    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }


    public void btn(View view) {
        A.setText("");
        B.setText("");
        C.setText("");
    }

    public void btnCalculate(View view) {
        a=A.getText().toString();
        b=B.getText().toString();
        c=C.getText().toString();
        wv.loadUrl("https://www.google.com/search?ei=pANSXImfIqbksAeEg4b4Cw&q="+a+"x%5E2%2B"+b+"x%2B"+c+"&oq=3x%5E2%2B2x%2B5&gs_l=psy-ab.3..0i203l2j0i30l8.4915.16278..17206...2.0..0.130.1324.0j11......0....1..gws-wiz.....6..0i71j0i7i30j35i39j0i131j0j0i67.cwSKBFjRUbM");

    }



}
