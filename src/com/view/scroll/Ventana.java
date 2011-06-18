package com.view.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Ventana extends Activity {
	
	LinearLayout ll;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ll = (LinearLayout) findViewById(R.id.linearLayout1);
        for(int i=0; i<10;i++){
        	
        	ImageView img = new ImageView(this);
        	img.setBackgroundResource(R.drawable.icon);
        	
        	ll.addView(img);
        }
        
        
        
    }
}