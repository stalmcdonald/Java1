package com.cmcdonald.lib;

import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class FormThings {
	
	
	public static LinearLayout singleEntryWithButton(Context context, String hint, String buttonText){
		LinearLayout linLay = new LinearLayout(context);
		LayoutParams layPar = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		linLay.setLayoutParams(layPar);
		
		//text view and button
		EditText edTxt = new EditText(context);
		//making layout go width of the device without pushing the button of the screen
		layPar = new LayoutParams(0,LayoutParams.WRAP_CONTENT,1.0f);
		edTxt.setHint(hint);
		edTxt.setLayoutParams(layPar);
		//set id on object
		edTxt.setId(101);
		
		Button mybutton = new Button(context);
		mybutton.setText(buttonText);
		//set id on object
		mybutton.setId(102);
		//edit text field is tagged to button
		mybutton.setTag(edTxt);
		
		
		//add to linear layout
		linLay.addView(edTxt);
		linLay.addView(mybutton);
		
		return linLay;
	}
	
	//radio layout view
	//holds radio buttons
	public static RadioGroup getOptions(Context context, String[] options){
		RadioGroup box = new RadioGroup(context);
		
		for(int i=0; i<options.length; i++){
			RadioButton rBttn = new RadioButton(context);
			rBttn.setText(options[i]);
			rBttn.setId(i+1);
			box.addView(rBttn);
			
			
		}
		return box;
	}
}
