package com.masai.help;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    Button b2;
    TextView t2;
    Button b3;
    TextView t3;
    Button b4;
    TextView t4;
    Button b5;
    TextView t5;
    Button b6;
    TextView t6;
    Button b7;
    TextView t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Debug","OnCreate Started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        t1 = (TextView) findViewById(R.id.textView1);
        String text1 = b1.getText().toString();

        b2 = (Button) findViewById(R.id.button2);
        t2 = (TextView) findViewById(R.id.textView2);
        String text2 = b2.getText().toString();

        b3 = (Button) findViewById(R.id.button3);
        t3 = (TextView)findViewById(R.id.textView3);
        String text3 = b3.getText().toString();

        b4 = (Button) findViewById(R.id.button4);
        t4 = (TextView) findViewById(R.id.textView4);
        String text4 = b4.getText().toString();

        b5 = (Button) findViewById(R.id.button5);
        t5 = (TextView) findViewById(R.id.textView5);
        String text5 = b5.getText().toString();

        b6 = (Button) findViewById(R.id.button6);
        t6 = (TextView)findViewById(R.id.textView6);
        String text6 = b6.getText().toString();

        b7 = (Button) findViewById(R.id.button7);
        t7 = (TextView) findViewById(R.id.textView7);
        String text7 = b7.getText().toString();

    }


    public void btn1tv1(View view) {
        String text1 = b1.getText().toString();
        if (text1.equals("What is nearbuy.com?")) {
            t1.setVisibility(View.INVISIBLE);
            b1.setText("What is nearbuy.com?  ");
        } else if (text1.equals("What is nearbuy.com?  ")){
            t1.setVisibility(View.VISIBLE);
            b1.setText("What is nearbuy.com?");
        }
    }

    public void btn2tv2(View view) {
        String text2 = b2.getText().toString();
        if (text2.equals("I have feedback or an idea to share, how do I share it?")) {
            t2.setVisibility(View.INVISIBLE);
            b2.setText("I have feedback or an idea to share, how do I share it?  ");
        } else if (text2.equals("I have feedback or an idea to share, how do I share it?  ")) {
            t2.setVisibility(View.VISIBLE);
            b2.setText("I have feedback or an idea to share, how do I share it?");
        }
    }

    public void btn3tv3(View view) {
        String text3 = b3.getText().toString();
        if (text3.equals("What is new on nearbuy.com?")) {
            t3.setVisibility(View.INVISIBLE);
            b3.setText("What is new on nearbuy.com?  ");
        } else if (text3.equals("What is new on nearbuy.com?  ")) {
            t3.setVisibility(View.VISIBLE);
            b3.setText("What is new on nearbuy.com?");
        }
    }

    public void btn4tv4(View view) {
        String text4 = b4.getText().toString();
        if (text4.equals("How do I buy & consume awesome offers on nearbuy.com?")) {
            t4.setVisibility(View.INVISIBLE);
            b4.setText("How do I buy & consume awesome offers on nearbuy.com?  ");
        } else if (text4.equals("How do I buy & consume awesome offers on nearbuy.com?  ")) {
            t4.setVisibility(View.VISIBLE);
            b4.setText("How do I buy & consume awesome offers on nearbuy.com?");
        }
    }

    public void btn5tv5(View view) {
        String text5 = b5.getText().toString();
        if (text5.equals("How do I contact Customer Support?")) {
            t5.setVisibility(View.INVISIBLE);
            b5.setText("How do I contact Customer Support?  ");
        } else if (text5.equals("How do I contact Customer Support?  ")) {
            t5.setVisibility(View.VISIBLE);
            b5.setText("How do I contact Customer Support?");
        }
    }

    public void btn6tv6(View view) {
        String text6 = b6.getText().toString();
        if ((text6.equals("How do I register myself on nearbuy.com?"))) {
            t6.setVisibility(View.INVISIBLE);
            b6.setText("How do I register myself on nearbuy.com?  ");
        } else if (text6.equals("How do I register myself on nearbuy.com?  ")){
            t6.setVisibility(View.VISIBLE);
            b6.setText("How do I register myself on nearbuy.com?");
        }
    }

    public void btn7tv7(View view) {
        String text7 = b7.getText().toString();
        if (text7.equals("Why should I download the nearbuy.com mobile app?")) {
            t7.setVisibility(View.INVISIBLE);
            b7.setText("Why should I download the nearbuy.com mobile app?  ");
        } else if (text7.equals("Why should I download the nearbuy.com mobile app?  ")) {
            t7.setVisibility(View.VISIBLE);
            b7.setText("Why should I download the nearbuy.com mobile app?");
        }
    }

}