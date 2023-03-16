package com.application.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;
    EditText myEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo We connect that variable button with actual button

        myButton = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView);
        myEditText = findViewById(R.id.editTextTextPersonName);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Todo Button Action

                String inputValue = myEditText.getText().toString();
                myTextView.setText("Welcome to SIT305_708 \n"+inputValue);

                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
                Log.v("Check Message", "Hello World!");
            }
        });




    }

}