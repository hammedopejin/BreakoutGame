package com.example.hammedopejin.breakoutgame.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.hammedopejin.breakoutgame.BreakoutGame;

/**
 * Created by hammedopejin on 3/21/17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, BreakoutGame.class);
        startActivity(intent);
        finish();
    }
}

