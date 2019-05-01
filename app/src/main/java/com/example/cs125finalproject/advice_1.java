package com.example.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class advice_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.advice_1);

        Button breakButton = findViewById(R.id.breakButton);
        breakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View advice_1) {
                openBreakAdvice();
            }
        });
        Button napButton = findViewById(R.id.napButton);
        napButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View advice_1) {
                openNapAdvice();
            }
        });
        Button talkButton = findViewById(R.id.talkButton);
        talkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View advice_1) {
                openTalkAdvice();
            }
        });
        Button walkButton = findViewById(R.id.walkButton);
        walkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View advice_1) {
                openWalkAdvice();
            }
        });
    }
    public void openBreakAdvice() {
        Intent intent = new Intent(this, com.example.cs125finalproject.break_advice.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openNapAdvice() {
        Intent intent = new Intent(this, com.example.cs125finalproject.nap_advice.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openTalkAdvice() {
        Intent intent = new Intent(this, com.example.cs125finalproject.talk_advice.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openWalkAdvice() {
        Intent intent = new Intent(this, com.example.cs125finalproject.walk_advice.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }

    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
