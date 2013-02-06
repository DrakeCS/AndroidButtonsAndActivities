/* author: Tim Urness
 * date: 2/5/2013
 * description: This is a demo of a simple button press that launches a new activitiy
 * 				This is the second screen that contains a button to go back to the first screen. 
 */


package edu.Drake.androidactivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {

	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//create stuff here
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//establis the button
		button = (Button) findViewById(R.id.button1); 
		button.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View v) {
				//when clicked, the activitiy will pop off the stack
				finish();
			}
		});
	}

	/*
	 * NO Menu necessary on this app
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}
	*/

}
