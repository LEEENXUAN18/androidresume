package com.example.exercise1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class App4Activity extends Activity {

    Button button1, button2;
    ImageView imageView;  // Use imageView to match XML ID

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);  // Ensure this is the correct layout file
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;
        imageView = (ImageView) findViewById(R.id.imageView);  // Ensure ID matches XML

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App3Activity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, AppActivity.class);
                startActivity(intent);
            }
        });
    }
}
