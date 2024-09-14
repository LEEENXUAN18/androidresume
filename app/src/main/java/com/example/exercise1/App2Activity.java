package com.example.exercise1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class App2Activity extends Activity {

    Button button1, button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);  // Ensure this is the correct layout file
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button1 = (Button) findViewById(R.id.button1);  // Ensure ID matches XML
        button2 = (Button) findViewById(R.id.button2);  // Ensure ID matches XML

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AppActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, App3Activity.class);
                startActivity(intent);
            }
        });
    }
}