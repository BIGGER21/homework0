package com.example.bigger.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View view){
        Toast.makeText(getApplicationContext(),"This button will launch POPULAR MOVIES",Toast.LENGTH_SHORT).show();
    }

    public void btn2(View view){
        Toast.makeText(getApplicationContext(),"This button will launch STOCK HAWK",Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view){
        Toast.makeText(getApplicationContext(),"This button will BUILD IT BIGGER",Toast.LENGTH_SHORT).show();
    }

    public void btn4(View view){
        Toast.makeText(getApplicationContext(),"This button will MAKE YOUR APP MATERIAL",Toast.LENGTH_SHORT).show();
    }

    public void btn5(View view){
        Toast.makeText(getApplicationContext(),"This button will GO UBIQUITOUS",Toast.LENGTH_SHORT).show();
    }

    public void btn6(View view){
        Toast.makeText(getApplicationContext(),"This button will launch CAPSTONE APP",Toast.LENGTH_SHORT).show();
    }
}
