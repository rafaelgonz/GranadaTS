package com.example.granadats;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView myWebView = (WebView) this.findViewById(R.id.webView);
		myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://granadats.cloudapp.net");
	}


}
