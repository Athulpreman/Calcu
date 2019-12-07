package com.example.calculatr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class substraction extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    int s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substraction);

        e1=(EditText)findViewById(R.id.first);
        e2=(EditText)findViewById(R.id.second);
        b=(Button)findViewById(R.id.butto);

        s1=Integer.parseInt(e1.getText().toString());
        s2=Integer.parseInt(e2.getText().toString());

        s3=s1-s2;

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"result = "+s3,Toast.LENGTH_LONG).show();
            }
        });
    }
}
