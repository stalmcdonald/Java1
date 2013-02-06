/*
 * 
 */
package com.crystalmcdonald.week1;

import com.crystalmcdonald.week1.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.support.v4.app.NavUtils;


// TODO: Auto-generated Javadoc

public class Main extends Activity {

	LinearLayout myLayout;
	
	/** The lp. */
	LinearLayout.LayoutParams myLp;

	TextView result;
	
	/** The et. */
	EditText editEntry;
	//integers
	 int virusExposedInd = 107;
     int zombie = virusExposedInd;
     double infected = 107.0d;
     int infectedPeople = (int) infected;
     Boolean companions=true ;
	
    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //layout and parameters
        myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);
        myLp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        myLayout.setLayoutParams(myLp);
        
        //story gives context to app
        TextView storyView = new TextView(this);
        storyView.setText("After an explosion of Ajack Chemical Factory, workers started displaying what can only be characterized as zombie-like symptoms. There has been widespread panic but CDC assures us that there are no long-term repercussions of the chemical explosion. We have asked Ajack Chemical Factory to comment and they have thus far remained silent. We advise everyone to stay indoors as a safety precaution. We interviewed an employee of the factory who was miraculously home from work today. His name has been withheld but he made the following statement to the public as an inside source. I have checked on many co-workers today, their families are worried about the symptoms and the zombie like behavior they are exhibiting. The CDC says they have are compiling a damage report and that everything is under control. At this time they have rounded up those infected. Total population infected =%d.");
        
        myLayout.addView(storyView);
        
        
      //If, Else If, Else
        //Tells users what to expect in their environment
        TextView conditionalView = new TextView(this);
        //conditionalView.setText(text)
        if (virusExposedInd < 100)
        {
           conditionalView.setText("Proceed with Caution.");
        }
        else if ((virusExposedInd > 99) && (virusExposedInd < 1000)) //comparison && statement
        {
            conditionalView.setText("There is a good chance the Zombie Apocalypse has begun!");
        }
        else {
            conditionalView.setText("Hide your kids, hide your wives, and hide your husbands because they're eating everybody out here!");
        }
        myLayout.addView(conditionalView);
        
      
        //Boolean statement
        //Companions are vital to survival!
        //companions set to true at the top
        TextView boolView = new TextView(this);
        boolView.setText("You have a better chance of survival with many companions.");
        if (companions==true) {
        	boolView.setText("You were clever to find companions. Find more!");
        }
        else {
        	boolView.setText("You should run, without companions your odds of survival are slim!");
        }
        myLayout.addView(boolView);
        
      //Casting Float requirements
        //weapons
        TextView floatView = new TextView(this);
        floatView.setText("Always remember weapons are important to your survival. Don't forget to stock up!");
        float weaponsatchel = 8.56362f;
        int myweapons = (int) weaponsatchel;
        floatView.setText("You have %f storage slots in your satchel and %d weapons to use. Resupply as needed.");//, weaponsatchel, myweapons);
        myLayout.addView(floatView);
        
      //Fighting Zombies Zombies vs Ammo
        //For - Single Loop
        TextView loopView = new TextView(this);
        loopView.setText("You have encountered a mob of zombies");
        int ammo = 10;
        int shots = zombie;
        for (int c =0; c < shots; c++)
        {
            zombie = (zombie - 1);
            ammo = (ammo -1);
            loopView.setText("One zombie shot.");
//            loopView.setText("Zombies left=%d.", zombie);
//            loopView.setText("Ammo left=%d.", ammo);
            
            
            if(ammo == 0)
            {
            	loopView.setText("You are out of ammo. Ammo reloaded to 10.");
                ammo =10;
            }
            
        
            else if ((ammo >= 0)&&(zombie==0))
                {
        
            	loopView.setText("All zombies are dead.");
                }
            }
        myLayout.addView(loopView);
        
        //Instructions for Edit view 
        TextView ammoView = new TextView(this);
        ammoView.setText("You will encounter Zombies in the near future, to see if you have enough ammo enter zombie hoarde figures you encounter below.");
        myLayout.addView(ammoView);
        
        //Edit
        editEntry = new EditText(this);
        editEntry.setHint("# of Zombies");
        //ll.addView(et);
        
        //Button
        Button ammoButton = new Button(this);
        ammoButton.setText("Ammo Needed");
        ammoButton.setOnClickListener(new View.OnClickListener() { //onClick event
			
        	//resources
			@Override
			public void onClick(View v) {
				int gun = getResources().getInteger(R.integer.gun);
				int crossbow = getResources().getInteger(R.integer.crossbow);
				int bow = getResources().getInteger(R.integer.bow);
				
				
				int numEntered = Integer.parseInt(editEntry.getText().toString());
				
				int numG = (10/gun)*numEntered;
				int numC = (10/crossbow)*numEntered;
				int numB = (10/bow)*numEntered;
				
				
				result.setText("Gun: " + numG + "\r\n" +
						       "Crossbow: " + numC + "\r\n" +
						       "Bow: " + numB + "\r\n"
						       );
				
			}
		});
        
        LinearLayout myLLView = new LinearLayout(this);
        myLLView.setOrientation(LinearLayout.HORIZONTAL);
        myLp= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        myLLView.setLayoutParams(myLp);
        
        myLLView.addView(editEntry);
        myLLView.addView(ammoButton);
        
        myLayout.addView(myLLView);
        
        result = new TextView(this);
        //result.setLayoutParams(lp);
        myLayout.addView(result);
        
        setContentView(myLayout);
    }

    private void getText(String string) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
     * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
