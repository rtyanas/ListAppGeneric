package com.fuzz.simpleapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

/**
 * 
 * When selecting an item display the passed in URL
 *
 */
public class WebActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
		WebView myWebView = (WebView) findViewById(R.id.webView);
		// Get URL to display in WebView
		String url = getIntent().getStringExtra(MainActivity.WEB_PAGE);
		myWebView.loadUrl(url);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web, menu);
		return true;
	}

}
