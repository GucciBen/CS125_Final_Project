package com.example.cs125finalproject;




import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;


import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;





public class startSplash extends AppCompatActivity {

    static int SPLASH_FADEOUT_DELAY = 10000;

    private TextView quoteText;
    private TextView authorText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_start_splash);
        Log.d("splash","Hello");


        quoteText = findViewById(R.id.text_quote);
        authorText = findViewById(R.id.text_author);
        OkHttpClient client = new OkHttpClient();
        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String myResponse = response.body().string();
                    startSplash.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Log.d("splash", myResponse);
                            JsonParser quoteParser = new JsonParser();
                            JsonObject quoteRoot = quoteParser.parse(myResponse).getAsJsonObject();
                            String quote = quoteRoot.get("quoteText").getAsString();
                            JsonParser authorParser = new JsonParser();
                            JsonObject authorRoot = authorParser.parse(myResponse).getAsJsonObject();
                            String author = authorRoot.get("quoteAuthor").getAsString();
                            if (author.equals("")) {
                                author = "unknown";
                            }
                            author = ("- " + author);
                            quoteText.setText(quote);
                            authorText.setText(author);
                        }
                    });
                }
            }
        });


        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(startSplash.this, MainActivity.class);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                startActivity(intent);
                finish();
            }
        }, SPLASH_FADEOUT_DELAY);


        FloatingActionButton nextView = findViewById(R.id.nextButton);
        nextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
                Intent intent = new Intent(startSplash.this, MainActivity.class);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                startActivity(intent);
                finish();
            }
        });
    }


    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }


}