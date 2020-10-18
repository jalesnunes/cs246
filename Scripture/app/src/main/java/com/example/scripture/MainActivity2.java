package com.example.scripture;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        String bookString    = bundle.getString("bookString");
        String chapterString = bundle.getString("chapterString");
        String verseString   = bundle.getString("verseString");

        TextView txtView = (TextView) findViewById(R.id.display);
        txtView.setText(bookString + " " + chapterString + ":" + verseString);
    }
}