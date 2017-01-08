package com.mit.intexhx14;



import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Mediapage  extends Activity {

	 public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
	
	 ProgressDialog mProgressDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.media);
		 Toast.makeText(this, "Internet Access Required. Scanning.", Toast.LENGTH_LONG).show();
		 
		
		 Button buttondld = (Button) findViewById(R.id.buttondld);
		ImageButton back = (ImageButton) findViewById(R.id.imageButtonmbk);
		 Button startBtn = (Button)findViewById(R.id.buttondld);
		WebView ourbrow =(WebView)findViewById(R.id.wvBrowser);
		ourbrow.getSettings().setJavaScriptEnabled(true);
		ourbrow.getSettings().setLoadWithOverviewMode(true);
		ourbrow.getSettings().setUseWideViewPort(true);
		ourbrow.setWebViewClient(new ourviewclient());
		try{
		ourbrow.loadUrl("https://www.youtube.com/watch?v=lk4qdCZ5yHI");
		}catch(Exception e){
			e.printStackTrace();
		}
		//back button
				back.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						finish();
						
					}
				});
		//Download button	
				startBtn.setOnClickListener(new OnClickListener(){
		            public void onClick(View v) {
		                startDownload();
		            }
		        });
				
			}


	 private void startDownload() {
	        String url = "cdn.enjoypur.vc/upload_file/5072/5073/7608/BOSS%20Ringtones/Boss%20(Honey%20Singh%20RAP)%20-%20Boss%20Ringtone%20-%20%5BPagalWorld.Com%5D.mp3";
	        new DownloadFileAsync().execute(url);
	    }
	 @Override
	    protected Dialog onCreateDialog(int id) {
		
			switch (id) {
			case DIALOG_DOWNLOAD_PROGRESS:
				mProgressDialog = new ProgressDialog(this);
				mProgressDialog.setMessage("Downloading file..");
				mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
				mProgressDialog.setCancelable(true);
				mProgressDialog.show();
				return mProgressDialog;
			default:
				return null;
	        }
	    }

	 class DownloadFileAsync extends AsyncTask<String, String, String> {
		   
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				showDialog(DIALOG_DOWNLOAD_PROGRESS);
			}

			@Override
			protected String doInBackground(String... aurl) {
				int count;

			try {

			URL url = new URL(aurl[0]);
			URLConnection conexion = url.openConnection();
			conexion.connect();

			int lenghtOfFile = conexion.getContentLength();
			Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

			InputStream input = new BufferedInputStream(url.openStream());
			OutputStream output = new FileOutputStream("/sdcard/intex14.mp3");

			byte data[] = new byte[1024];

			long total = 0;
			
			
				while ((count = input.read(data)) != -1) {
					total += count;
					publishProgress(""+(int)((total*100)/lenghtOfFile));
					output.write(data, 0, count);
				}

				output.flush();
				output.close();
				input.close();
			} catch (Exception e) {}
			return null;

			}
			protected void onProgressUpdate(String... progress) {
				 Log.d("ANDRO_ASYNC",progress[0]);
				 mProgressDialog.setProgress(Integer.parseInt(progress[0]));
			}

			@Override
			protected void onPostExecute(String unused) {
				dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
			}
		}






}
