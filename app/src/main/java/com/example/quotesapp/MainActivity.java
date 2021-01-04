package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button share;
    TextView quotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share = findViewById(R.id.btnShare);
        quotes = findViewById(R.id.tvQuotes);

        getSupportActionBar().hide();
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareTxt = quotes.getText().toString();
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("txt/plain");
                intent.putExtra(Intent.EXTRA_TEXT,shareTxt);
                startActivity(intent);
            }
        });
    }
}