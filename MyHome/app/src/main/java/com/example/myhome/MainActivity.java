package com.example.myhome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) this.findViewById(R.id.h_btn);

        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(view v)
            {
                Intent next = new Intent();
            }
        });
    }
}