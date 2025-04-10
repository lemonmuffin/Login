package com.example.cl;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText eNumber1Text;
    private EditText eNumber2Text;
    private TextView eTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eNumber1Text = (EditText) findViewById(R.id.editTextNumber1);
        eNumber2Text = (EditText) findViewById(R.id.editTextNumber2);
        eTextView = (TextView) findViewById(R.id.textViewResult);
    }

    public void onClicksum(View view) {
        String num1Str = eNumber1Text.getText().toString();
        String num2Str = eNumber2Text.getText().toString();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int sum = num1 + num2;

        eTextView.setText(String.valueOf(sum));
    }

    public void onClicksub(View view) {
        String num1Str = eNumber1Text.getText().toString();
        String num2Str = eNumber2Text.getText().toString();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int sum = num1 - num2;

        eTextView.setText(String.valueOf(sum));
    }

    public void onClickmul(View view) {
        String num1Str = eNumber1Text.getText().toString();
        String num2Str = eNumber2Text.getText().toString();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int sum = num1 * num2;

        eTextView.setText(String.valueOf(sum));
    }

    public void onClickdiv(View view) {
        String num1Str = eNumber1Text.getText().toString();
        String num2Str = eNumber2Text.getText().toString();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int sum = num1 / num2;

        eTextView.setText(String.valueOf(sum));
    }
}