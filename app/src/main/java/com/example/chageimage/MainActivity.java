package com.example.chageimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.TextView;
import android.widget.ScrollView;
//import android.widget.EditText;
import android.widget.CompoundButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button onTop, up, down;
    TextView myText;
    ToggleButton mySwitch;
    ScrollView myScroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onTop = (Button) findViewById(R.id.button);
        down = (Button) findViewById(R.id.button2);
        up = (Button) findViewById(R.id.button3);
        myText = (TextView) findViewById(R.id.textView2);
        mySwitch = (ToggleButton) findViewById(R.id.toggle);
        myScroll = (ScrollView) findViewById(R.id.scrollView);
        myText.setText(R.string.my_text);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    up.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            myScroll.scrollBy(0, +20);
                        }
                    });

                    down.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            myScroll.scrollBy(0, -20);
                        }
                    });
                }
            }
        });
        onTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myScroll.scrollTo(0, 0);
            }
        });



    }
}