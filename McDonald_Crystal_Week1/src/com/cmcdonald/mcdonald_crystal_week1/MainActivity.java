/*
 * project	McDonald_Crystal_Week1
 * 
 * package com.cmcdonald.mcdonald_crystal_week1
 * 
 * @author	Crystal McDonald
 * 
 * date Feb 4, 2013
 */
package com.cmcdonald.mcdonald_crystal_week1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
