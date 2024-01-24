package com.minun.uibasicsdemo;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.myButton:{
                TextView textView = findViewById(R.id.myTextView);
                textView.setText("clicked!");
                Toast.makeText(this, "Congratulations you clicked the button!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}