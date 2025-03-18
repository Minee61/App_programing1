package com.example.edittexttask;

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

    private EditText enText;
    private EditText epaText;
    private EditText ephText;
    private Button Button;
    private TextView eIdTextView;
    private TextView ePassTextView;
    private TextView ePhoneTextView;

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


        enText = (EditText) findViewById(R.id.edTextText);
        epaText = (EditText) findViewById(R.id.edPassword);
        ephText = (EditText) findViewById(R.id.edPhone);
        Button = (Button) findViewById(R.id.button);
        eIdTextView =(TextView) findViewById(R.id.IdText) ;
        ePassTextView =(TextView) findViewById(R.id.PassText) ;
        ePhoneTextView =(TextView) findViewById(R.id.PhoneText) ;
    }

    public void onClick(View view) {
        String str = enText.getText().toString();
        eIdTextView.setText(str);

        String str1 = epaText.getText().toString();
        ePassTextView.setText(str1);

        String str2 = ephText.getText().toString();
        ePhoneTextView.setText(str2);
    }
}