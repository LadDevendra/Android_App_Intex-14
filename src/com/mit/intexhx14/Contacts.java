package com.mit.intexhx14;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contacts extends Activity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.contacts);	
		
		ImageButton call1 = (ImageButton) findViewById(R.id.imageButtoncall1);	
		ImageButton call2 = (ImageButton) findViewById(R.id.imageButtoncall2);	
		ImageButton back = (ImageButton) findViewById(R.id.imageButtonbk);
		ImageButton emailib = (ImageButton) findViewById(R.id.imageButton1);
		
		//back button
		back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		//call1 button
		call1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("tel:8087670165")));
				
			}
		});
		//call2 button
				call2.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						startActivity(new Intent(Intent.ACTION_VIEW,
								Uri.parse("tel:8087502548")));
						
					}
				});
	
				//Email button
				emailib.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						String email = "dvendralad22@gmail.com";
						String emailArray[] = { email };
						// TODO Auto-generated method stub
						Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
						emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailArray);
						emailIntent.setType("plain/text");
						startActivity(emailIntent);
					}
				});
	
	
	
	}

	
}
