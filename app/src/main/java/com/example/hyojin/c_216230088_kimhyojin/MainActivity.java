package com.example.hyojin.c_216230088_kimhyojin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//
//    ImageButton kakao;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();

    }
//
//    public void kakakogo(View v){
//        Intent i = new Intent(this,SubActivity_kakao.class);
//        startActivity(i);}

//    private void hideActionBar() {
//        ActionBar actionBar = getSupportActionBar();
//
//        if (actionBar != null) {
//            actionBar.hide();
//        }
//    }

    public void onClick(View view) {
        Intent intent1 = new Intent(this, SubActivity_insta.class);
        startActivity(intent1);
    }

    public void onClick1(View view) {
        Intent i1 = new Intent(this, SubActivity_kakao.class);
        startActivity(i1);
    }


}
