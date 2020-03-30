package com.example.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bntOK(View view) {
        TextView a =(TextView)findViewById(R.id.a );
        RadioGroup b = (RadioGroup )findViewById(R.id.b);
        int id =b .getCheckedRadioButtonId();
        RadioButton selected = (RadioButton )findViewById(id);
        a.setText("我的最愛是:"+ selected .getText());
    }
}
