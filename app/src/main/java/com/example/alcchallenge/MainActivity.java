package com.example.alcchallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnAbout;
    private Button mBtnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.home_nav_title);

        mBtnAbout = findViewById(R.id.btnAboutAlc);
        mBtnMyProfile = findViewById(R.id.btnMyProfile);

    }

    public void onClick(View v){
        if (v.getId() == R.id.btnAboutAlc) {
            Intent intent = new Intent(getApplicationContext(), AboutAlcActivity.class);
            intent.putExtra("url", "https://andela.com/alc/");
            startActivity(intent);
        } else if (v.getId() == R.id.btnMyProfile){
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
        }
    }
}
