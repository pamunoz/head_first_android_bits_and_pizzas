package com.pfariasmunoz.bitsandpizzas;

import android.app.Activity;
import android.os.Bundle;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.create_order);
        setContentView(R.layout.activity_order);
    }
}
