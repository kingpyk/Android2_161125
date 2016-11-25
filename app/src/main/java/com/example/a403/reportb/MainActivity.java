package com.example.a403.reportb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch s1;
    LinearLayout L1;
    RadioGroup R1;
    ImageView IV1;
    RadioButton rb,rb1,rb2;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        s1 = (Switch)findViewById(R.id.switch1);
        L1 = (LinearLayout)findViewById(R.id.linear1);
        R1 = (RadioGroup)findViewById(R.id.rg1);
        IV1 = (ImageView)findViewById(R.id.imageView);
        rb = (RadioButton)findViewById(R.id.rb);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);

        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true)
                    L1.setVisibility(View.VISIBLE);
                else
                    L1.setVisibility(View.INVISIBLE);
            }
        });
        rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    IV1.setImageResource(R.drawable.android1);
            }
        });
        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    IV1.setImageResource(R.drawable.android2);
            }
        });
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    IV1.setImageResource(R.drawable.android3);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1.setChecked(false);
                L1.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(),"화면이 초기화됩니다.",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
