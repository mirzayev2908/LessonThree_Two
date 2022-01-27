package com.example.lessonthree_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

     void initViews() {
         Button btn=findViewById(R.id.btn);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openSecondActivity();
             }
         });
    }
    void openSecondActivity(){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}