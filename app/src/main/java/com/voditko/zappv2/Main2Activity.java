package com.voditko.zappv2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtView;
    double latitude,longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       txtView = (TextView) findViewById(R.id.textView);
        MainActivity mainActivity = new MainActivity();
        latitude = mainActivity.getLatitude();
        longitude =mainActivity.getLongitude();
        txtView.setText(latitude +" , "+longitude);
    }

}
