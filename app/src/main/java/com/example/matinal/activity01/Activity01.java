package com.example.matinal.activity01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
    }

    public void boton1(View view) {
        Intent intent = new Intent(this, Activity02.class);
        startActivity(intent);
    }

    public void onPause() {
        super.onPause();
        finish();
    }

}
