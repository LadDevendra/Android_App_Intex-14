package com.mit.intexhx14;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton media = (ImageButton) findViewById(R.id.imageButton33);
        ImageButton contacts = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton back = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton updates=(ImageButton)findViewById(R.id.imageButton5);
        
        ImageButton about=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton events=(ImageButton)findViewById(R.id.imageButton6);
        ImageButton register=(ImageButton)findViewById(R.id.imageButton3);
    
        
        // media Button
 		media.setOnClickListener(new View.OnClickListener() {

 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 				Intent b = new Intent("com.mit.intexhx14.MEDIAPAGE");
 				startActivity(b);

 			}

 		});
        
        // Contacts Button
     		contacts.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Intent b = new Intent("com.mit.intexhx14.CONTACTS");
     				startActivity(b);

     			}

     		});
     		
     		 // about Button
     		about.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Intent b = new Intent("com.mit.intexhx14.ABOUT");
     				startActivity(b);

     			}

     		});
     		
     		 // register Button
     		register.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Intent b = new Intent("com.mit.intexhx14.REGISTER");
     				startActivity(b);

     			}

     		});
     		
     		 // events Button
     		events.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Intent b = new Intent("com.mit.intexhx14.EVENTS");
     				startActivity(b);

     			}

     		});
     		
     		 // updates Button
     		updates.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Intent b = new Intent("com.mit.intexhx14.UPDATES");
     				startActivity(b);
 
     			}

     		});
            //Back button
     		back.setOnClickListener(new View.OnClickListener() {

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				finish();
     			}

     		});

        
        
    }


   
    
}
