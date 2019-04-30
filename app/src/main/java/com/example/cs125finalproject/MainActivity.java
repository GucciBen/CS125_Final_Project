package com.example.cs125finalproject;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);

        //adviceView loader:
        Button advice_1 = findViewById(R.id.advice_1);
        advice_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openAdvice_1();
            }
        });
    }

    public void openSplash() {
        Intent intent = new Intent(this, startSplash.class);
        startActivity(intent);
    }
    public void openAdvice_1() {
        Intent intent = new Intent(this, com.example.cs125finalproject.advice_1.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }


    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
