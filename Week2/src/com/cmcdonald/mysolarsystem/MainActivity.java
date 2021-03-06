package com.cmcdonald.mysolarsystem;

/*
 * Crystal McDonald
 * Java 1 1302
 * Week 2
 */


import java.util.ArrayList;
import java.util.HashMap;

import SS.Moon;
import  SS.Planet;
import SS.solarsystem;

import com.cmcdonald.lib.FormThings;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends Activity {
	RadioGroup moonInfo;
	ArrayList<solarsystem> sSystem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout linLay = new LinearLayout(this);
		LayoutParams layP = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		linLay.setLayoutParams(layP);
		linLay.setOrientation(LinearLayout.VERTICAL);
		
		LinearLayout myEntryView = FormThings.singleEntryWithButton(this, "Enter any # 1-10" , "Go");
		
		//clicking on button
		//EditText tempButton = (EditText) myEntryView.findViewById(101);
		Button moneyButton = (Button) myEntryView.findViewById(102);
		
		
		//attaching button listener
		moneyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int selectedRadioId = moonInfo.getCheckedRadioButtonId();
				RadioButton selectedRadio = (RadioButton) moonInfo.findViewById(selectedRadioId);
				String radioText = (String) selectedRadio.getText();
				
				double amount =0;
				for(int i=0; i<sSystem.size(); i++){
					if(radioText.compareTo(sSystem.get(i).getLargestMoon()) == 0){
						amount = sSystem.get(i).getNumberofMoons();
						
					}
				}
				
				EditText planetText =(EditText) v.getTag();
				double planet = Double.parseDouble(planetText.getText().toString());
				double position = planet - amount;
				HashMap<Planet, Integer> fromSun = Planet.getOrder(position);
				
				Log.i("BUTTON CLICKED:", 
						"Pluto: " + fromSun.get(Planet.PLUTO) + "\r\n" +
						"Neptune: " + fromSun.get(Planet.NEPTUNE) + "\r\n" +
						"Uranus: " + fromSun.get(Planet.URANUS) + "\r\n" +
						"Saturn: " + fromSun.get(Planet.SATURN) + "\r\n" +
						"Jupiter: " + fromSun.get(Planet.JUPITER) + "\r\n" +
						"Mars: " + fromSun.get(Planet.MARS) + "\r\n" +
						"Earth: " + fromSun.get(Planet.EARTH) + "\r\n" +
						"Venus: " + fromSun.get(Planet.VENUS) + "\r\n" +
						"Mercury: " + fromSun.get(Planet.MERCURY) 
				);
		}
		});
		

		sSystem = new ArrayList<solarsystem>();
		
		sSystem.add(new Moon("Charon",4));
		sSystem.add(new Moon("Triton",13));
		sSystem.add(new Moon("Titania",27));
		sSystem.add(new Moon("Titan",53));
		sSystem.add(new Moon("Ganymede",50));
		sSystem.add(new Moon("Phobos",2));
		sSystem.add(new Moon("Moon",1));
		sSystem.add(new Moon("None",0));
		sSystem.add(new Moon("None",0));
		
		//accessing array
		String[] ssAttributes = new String[sSystem.size()];
		for(int i=0; i<sSystem.size(); i++){
			ssAttributes[i] = sSystem.get(i).getLargestMoon();
		}

		RadioGroup moonInfo = FormThings.getOptions(this, ssAttributes);
		
      
      linLay.addView(moonInfo);
		
		
		
		linLay.addView(myEntryView);
		
		setContentView(linLay);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
