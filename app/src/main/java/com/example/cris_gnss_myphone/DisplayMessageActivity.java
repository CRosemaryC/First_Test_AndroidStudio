package com.example.cris_gnss_myphone;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
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

//        We set an id to the button
//        blue_button.setId(1);
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



        // *** The following code is just for the button without the spineer


//        Button button_colour = findViewById(R.id.button2); // we define out button that we created in the xml
//        button_colour.setOnClickListener(
//                // now we add a call back method which is a method that is going to be called when a click event related to this button occurs.
//                new Button.OnClickListener(){
//
//                    // The following is the call back method
//                    public void onClick(View myView){
//                        TextView myText = findViewById(R.id.textView);
//                        myText.setTextColor(Color.GREEN);
//                     }
//                }
//
//        );
//
//        // We are going to use a long click listener which is a button that has to be hold more time to be activated
//        button_colour.setOnLongClickListener(
//                new Button.OnLongClickListener(){
//
//                    public boolean onLongClick(View myView){  // now is boolean beacause we expect a true or a false
//                        TextView myText = findViewById(R.id.textView);
//                        myText.setTextColor(Color.parseColor("#009688"));
//                        return true;
//                    }
//                }
//
//        );


    }

    public void onClickFindColour (View view){
        TextView myText = findViewById(R.id.textView);
        Spinner colourtype = findViewById(R.id.spinner_color);

        String colourselect = String.valueOf(colourtype.getSelectedItem());

        if (colourselect.equals("Blue")) {
            myText.setTextColor(getColor(R.color.colorblue));
        }else if (colourselect.equals("Green")) {
            myText.setTextColor(getColor(R.color.colorgreen));
        }else if (colourselect.equals("Red")) {
            myText.setTextColor(getColor(R.color.colorred));
        }else if (colourselect.equals("Yellow")) {
            myText.setTextColor(getColor(R.color.coloryellow));
        }else if (colourselect.equals("Orange")) {
            myText.setTextColor(getColor(R.color.colororange));
        }else if (colourselect.equals("Pink")) {
            myText.setTextColor(getColor(R.color.colorpink));
        }else if (colourselect.equals("Purple")) {
            myText.setTextColor(getColor(R.color.colorpurple));
        }else {
            myText.setTextColor(getColor(R.color.colorblack));
        }

    }

    public void onClickBack(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}
