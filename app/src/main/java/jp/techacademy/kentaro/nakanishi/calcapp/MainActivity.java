package jp.techacademy.kentaro.nakanishi.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View. OnClickListener{

    float answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        EditText math1 = (EditText) findViewById(R.id.math1);
        EditText math2 = (EditText) findViewById(R.id.math2);

        String str1 = math1.getText().toString();
        String str2 = math1.getText().toString();

        Log.d("UI_PARTS",str1);
        Log.d("UI_PARTS",str2);

        float one = Float.parseFloat(str1);
        float two = Float.parseFloat(str2);



        if (v.getId() == R.id.button1) {
            answer = one + two;
        } else if (v.getId() == R.id.button2) {
            answer = one - two;
        } else if (v.getId() == R.id.button3) {
            answer = one * two;
        } else if (v.getId() == R.id.button4) {
            answer = one / two;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ANS",answer);
        startActivity(intent);
    }
}
