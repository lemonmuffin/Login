package com.example.a221250141;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText eText;
    private EditText ePassword;
    private EditText ePhone;
    private Button eButton;
    private TextView eTextView1;
    private TextView eTextView2;
    private TextView eTextView3;


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

        eText = (EditText) findViewById(R.id.editText);
        ePassword = (EditText) findViewById(R.id.editTextPassword);
        ePhone = (EditText) findViewById(R.id.editTextphone);
        eButton = (Button) findViewById(R.id.button);
        eTextView1 = (TextView) findViewById(R.id.textView1);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);


    }

    public void onClicked(View view) {
        String str1 = eText.getText().toString();
        String str2 = ePassword.getText().toString();
        String str3 = ePhone.getText().toString();

        eTextView1.setText("아이디:"+str1);
        eTextView2.setText("패스워드:"+str2);
        eTextView3.setText("전화 번호:"+str3);
    }
}