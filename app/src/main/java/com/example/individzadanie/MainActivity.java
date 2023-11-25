package com.example.individzadanie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Text1;
    private EditText Text2;
    private EditText Text4; // Corrected the variable name
    private TextView Text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = findViewById(R.id.Text1);
        Text2 = findViewById(R.id.Text2);
        Text4 = findViewById(R.id.Text4); // Corrected the variable name
        Text3 = findViewById(R.id.Text3);

        Button buttonSl = findViewById(R.id.buttonSl);

        buttonSl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(Text1.getText().toString());
                float num2 = Float.parseFloat(Text2.getText().toString());
                float num4 = Float.parseFloat(Text4.getText().toString()); // Corrected the variable name
                float result = (num1 + num2 + num4) / 3;
                Text3.setText(String.valueOf(result));
            }
        });
    }
}
