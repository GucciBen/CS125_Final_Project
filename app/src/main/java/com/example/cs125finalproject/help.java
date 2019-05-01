package com.example.cs125finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.widget.TextView;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.help);
        final TextView help_text_1 = findViewById(R.id.help_text_1);
        Linkify.addLinks(help_text_1, Linkify.PHONE_NUMBERS);
        final TextView help_text_3 = findViewById(R.id.help_text_3);
        Linkify.addLinks(help_text_3, Linkify.WEB_URLS);
        final TextView help_text_6 = findViewById(R.id.help_text_6);
        Linkify.addLinks(help_text_6, Linkify.WEB_URLS);
        final TextView help_text_8 = findViewById(R.id.help_text_8);
        Linkify.addLinks(help_text_8, Linkify.PHONE_NUMBERS);
    }

    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}