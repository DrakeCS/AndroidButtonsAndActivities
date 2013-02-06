/* author: Tim Urness
 * date: 2/5/2013
 * description: This is a demo of a simple button press that launches a new activitiy
 * 				This is the first screen that contains a button. Pressing the button brings
 * 				up a second screen.
 */

package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";

	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//here's where things get created
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//define the button
		button = (Button) findViewById(R.id.button1); 
		button.setOnClickListener(new OnClickListener() { 
			@Override
			public void onClick(View v) {
				//code put here will be executed when button is pressed
				Log.v(TAG, "button pressed");

				//launch the 2nd screen via an Intent
				Intent intent = new Intent(v.getContext(), SecondActivity.class);
				startActivity(intent);
			}
		});
		
	}
}
