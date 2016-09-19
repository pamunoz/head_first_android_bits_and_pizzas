package com.pfariasmunoz.bitsandpizzas;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.create_order);
        setContentView(R.layout.activity_order);
        /**
         * WATCH IT!
         * if you enable the Up button for an activity, you must specify its parent in the Manifest.
         * if you don't, you'll get a null pointer exception when you call the setDisplayHomeAsUpEnabled() method.
         */
        ActionBar actionBar = getActionBar();
        // this enables the Up button in the action bar.
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


}
