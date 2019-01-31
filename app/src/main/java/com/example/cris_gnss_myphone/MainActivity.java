package com.example.cris_gnss_myphone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View; //View es una clase dentro del paquete android.view
import android.widget.EditText;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** called when the user taps the send button */
    public void sendMessage(View view){   /* aqui definimos sendMessage nombre del metodo dentro de la clase MainActivity*/
        // View es una clase dentro de tu metodo
        // view es el objeto o instancia dentro de la clase (y es al que le puedo llamar de otra manera)
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class); // el this es para decir en esta situacion
        EditText editText = (EditText) findViewById(R.id.editText); // (esto es hacer un cast)
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
