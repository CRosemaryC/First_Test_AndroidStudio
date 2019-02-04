package com.example.cris_gnss_myphone;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.EditText;

public class DisplayMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

//        **** This is a way of creating a new layout and a new button from here
//        RelativeLayout myLayout = new RelativeLayout(this);
//        Button blue_button = new Button(this);
//
//        blue_button.setText("Blue");
//
//        RelativeLayout.LayoutParams buttonDetails =
//                new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT
//                );
//        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
//
//        myLayout.addView(blue_button, buttonDetails);
//
//        setContentView(myLayout);




    }



}

