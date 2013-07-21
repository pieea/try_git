package com.androidbegin;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class NotificationView extends Activity {

	String title;
	String text;
	TextView txttitle;
	TextView txttext;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create Notification Manager
		NotificationManager notificationmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		// Dismiss Notification
		notificationmanager.cancel(0);
		
		// Retrive the data from MainActivity.java
		Intent i = getIntent();

		title = i.getStringExtra("title");
		text = i.getStringExtra("text");

		// Locate the TextView
		txttitle = (TextView) findViewById(R.id.title);
		txttext = (TextView) findViewById(R.id.text);

		// Set the data into TextView
		txttitle.setText(title);
		txttext.setText(text);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.notification_view, menu);
        return true;
    }
    
}
