package com.example.Start;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity implements View.OnClickListener{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button bouton = (Button) findViewById(R.id.button_valid_connexion);
        bouton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText et = (EditText) findViewById(R.id.et_email);
        Log.i("EMAIL", et.getText().toString());
    }
}
