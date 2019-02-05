package com.example.cris_gnss_myphone;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View; //View es una clase dentro del paquete android.view
import android.widget.EditText;
import android.util.Log;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "MyMessage";
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    /** called when the user taps the send button */
    public void sendMessage(View view){   /* aqui definimos sendMessage nombre del metodo dentro de la clase MainActivity*/
        // View es una clase dentro de tu metodo
        // view es el objeto o instancia dentro de la clase (y es al que le puedo llamar de otra manera)
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class); // el this es para decir en esta situacion
        EditText editText = findViewById(R.id.editText); // (esto es hacer un cast)
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

//    This are examples to see the activities of the app in the Logcat
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
    }

}