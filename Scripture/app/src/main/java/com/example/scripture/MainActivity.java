package com.example.scripture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //private Button button;
    //public static final String EXTRA_MESSAGE = "com.example.scripture.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });*/
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        EditText bookInput = (EditText) findViewById(R.id.textbook);
        EditText chapterInput = (EditText) findViewById(R.id.textchapter);
        EditText verseInput = (EditText) findViewById(R.id.textverse);

        String bookString    = bookInput.getText().toString();
        String chapterString = chapterInput.getText().toString();
        String verseString   = verseInput.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtra("bookString", bookString);
        intent.putExtra("chapterString", chapterString);
        intent.putExtra("verseString", verseString);

        startActivity(intent);
    }

    /*public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }*/
}