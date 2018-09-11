package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when cookie should be eaten.
     */
        public void eatCookie(View view) {
        //TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = findViewById(R.id.cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.main_text_view);
        textView.setText("I'm so full");
    }
}
