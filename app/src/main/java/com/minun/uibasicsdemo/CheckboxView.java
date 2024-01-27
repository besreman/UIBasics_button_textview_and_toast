package com.minun.uibasicsdemo;

import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CheckboxView extends AppCompatActivity {

    RadioGroup radioGroupMaritalStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_view);

        radioGroupMaritalStatus= findViewById(R.id.RadioGroupMaritalStatus);
        radioGroupMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioMarried:{
                        Toast.makeText(CheckboxView.this, "married", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radioSingle: {
                        Toast.makeText(CheckboxView.this, "single", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.radioRel:{
                        Toast.makeText(CheckboxView.this, "in relationShip", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}