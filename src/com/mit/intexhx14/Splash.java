package com.mit.intexhx14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle Devloveschiken) {
		// TODO Auto-generated method stub
		super.onCreate(Devloveschiken);
		setContentView(R.layout.splashscreen);
		 ImageButton splash1 = (ImageButton) findViewById(R.id.imageButtonsplash);
		
		 // Contacts Button
  		splash1.setOnClickListener(new View.OnClickListener() {

  			@Override
  			public void onClick(View arg0) {
  				// TODO Auto-generated method stub
  				Intent b = new Intent("com.mit.intexhx14.MAINACTIVITY");
  				startActivity(b);

  			}

  		});
		
	}		
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	
	
	

}
