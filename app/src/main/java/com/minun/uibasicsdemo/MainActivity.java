package com.minun.uibasicsdemo;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.myButton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.myButton:{
                TextView textView = findViewById(R.id.myTextView);
                textView.setText("clicked!");
                Toast.makeText(this, "Congratulations you clicked the button!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent();
                intent.setClass(this, CheckboxView.class);
                startActivity(intent);
            }
        }
    }
}