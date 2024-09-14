package com.example.exercise1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;  // Import ImageView class
import android.view.View;
import android.view.View.OnClickListener;

public class AppActivity extends Activity {

    Button button;
    ImageView image;  // Declare ImageView variable

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Ensure this is the correct layout file
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;

        // Correct the ID to match the XML layout
        image = (ImageView) findViewById(R.id.ImageLee); // Use 'ImageLee' from XML

        button = (Button) findViewById(R.id.Button1); // Use 'Button1' from XML

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.leeimage);
                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
        });
    }
}