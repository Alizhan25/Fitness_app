package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.startfitness);
        button2 = findViewById(R.id.startfitness2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }


        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.id_privacy){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nativeappdev.blogspot.com/2023/02/policy-types-of-data-collected-among.html"));
            startActivity(intent);

            return true;
        }
        if (id == R.id.id_term){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nativeappdev.blogspot.com/2023/02/health-disclaimer-this-application-and.html"));
            startActivity(intent);

            return true;
        }
        if (id == R.id.id_rate){
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));
            }catch (Exception exception){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
            }

            return true;
        }
        if (id == R.id.id_more){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/collection/cluster?gsr=SklqGFdESmQ5WXVBSHY2U3BSb1NjQm1xTHc9PbICLAoqCiZmaXRuZXNzY29hY2gud29ya291dHBsYW5uZXIud2VpZ2h0bG9zcxAH:S:ANO1ljIiAHM&hl=ru&gl=US"));
            startActivity(intent);

            return true;
        }
        if (id == R.id.id_share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String sharebody = "This is the best for yoga and fitness \n By this app you strength your body \n this is free download Now \n" + "https://play.google.com/store/apps/details?id=en";
            String sharehub = "Yoga and Fitness app";
            intent.putExtra(Intent.EXTRA_SUBJECT, sharehub);
            intent.putExtra(Intent.EXTRA_TEXT, sharebody);
            startActivity(Intent.createChooser(intent, "share using"));

            return true;
        }
        return true;
    }

    public void beforeage18(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void afterage18(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);
    }
}