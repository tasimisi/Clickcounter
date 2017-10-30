package com.example.tasmi.clickcounter_beadando;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int number = 0;
    private Button plus, minus, reset;
    private TextView text;
    private int clicks = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        plus = (Button) findViewById(R.id.button_plus);
        minus = (Button) findViewById(R.id.button_minus);
        reset = (Button) findViewById(R.id.button_reset);
        text = (TextView) findViewById(R.id.textView);

        plus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                number++;
                clicks++;

                if (clicks == 20) {
                    Toast.makeText(MainActivity.this, "Nagyon unatkozol!? Húzás tanulni!", Toast.LENGTH_LONG).show();
                }

                text.setText("" + number);
            }
        });

        minus.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                number--;
                clicks++;

                if (clicks == 20) {
                    Toast.makeText(MainActivity.this, "Nagyon unatkozol!? Húzás tanulni!", Toast.LENGTH_LONG).show();
                }

                text.setText("" + number);
            }
        }));

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                number= 0;
                clicks = 0;
                text.setText(""+ number);
            }
        });
    }
}
