package com.example.cs125finalproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button advice_0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(MainActivity.this, startSplash.class);
                startActivity(splashIntent);
                finish();
            }
        }, SPLASH_TIMEOUT);
*/
        setContentView(R.layout.activity_main);

        //adviceView loader:
        advice_0 = findViewById(R.id.advice_0);
        advice_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openAdvice_0();
            }
        });
    }

    public void openSplash() {
        Intent intent = new Intent(this, startSplash.class);
        startActivity(intent);
    }
    public void openAdvice_0() {
        Intent intent = new Intent(this, advice_0.class);
        startActivity(intent);
    }
}
