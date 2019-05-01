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
        Button help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openHelp();
            }
        });
        Button meditate = findViewById(R.id.meditate);
        meditate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openMeditate();
            }
        });
        Button breathe = findViewById(R.id.breathe);
        breathe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openBreathe();
            }
        });
        Button journal = findViewById(R.id.journal);
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_main) {
                openJournal();
            }
        });
    }

    public void openAdvice_1() {
        Intent intent = new Intent(this, com.example.cs125finalproject.advice_1.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openHelp() {
        Intent intent = new Intent(this, com.example.cs125finalproject.help.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openMeditate() {
        Intent intent = new Intent(this, com.example.cs125finalproject.meditate.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openBreathe() {
        Intent intent = new Intent(this, com.example.cs125finalproject.breathe.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }
    public void openJournal() {
        Intent intent = new Intent(this, com.example.cs125finalproject.journal.class);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        startActivity(intent);
    }


    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
