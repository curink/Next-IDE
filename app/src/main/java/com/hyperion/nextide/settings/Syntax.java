package com.hyperion.nextide.settings;

import android.app.Activity;
import android.os.Bundle;
import com.hyperion.nextide.R;

public class Syntax extends Activity 
{ 
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syntax); 
        //  getActionBar().setTitle("Settings");
        getActionBar().setDisplayShowTitleEnabled(true); 




    }
} 
