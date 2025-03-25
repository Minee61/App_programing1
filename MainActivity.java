package com.example.dice_project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    @SuppressLint("MissingInflatedId")
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

        imageView1 = findViewById(R.id.imageViewDice1);
        imageView2 = findViewById(R.id.imageViewDice2);
    }

    public void onClick(View view) {
        Random random = new Random();
        for(int i = 0; i<2; i++){
        int randomNumver = random.nextInt(5)+1;
        int randomNumver1 = random.nextInt(5)+1;

        ImageView imageview = findViewById(R.id.imageViewDice1);
        ImageView imageview1 = findViewById(R.id.imageViewDice2);
        if (randomNumver == 1){
            imageview.setImageResource(R.drawable.dice1);
        }
        if(randomNumver == 2){
            imageview.setImageResource(R.drawable.dice2);
        }
        if(randomNumver == 3){
            imageview.setImageResource(R.drawable.dice3);
        }
        if(randomNumver == 4){
            imageview.setImageResource(R.drawable.dice4);
        }
        if(randomNumver == 5){
            imageview.setImageResource(R.drawable.dice5);
        }
        if(randomNumver == 6){
            imageview.setImageResource(R.drawable.dice6);
        }

        // 주사위 2
        if (randomNumver1 == 1){
            imageview1.setImageResource(R.drawable.dice1);
        }
        if(randomNumver1 == 2){
            imageview1.setImageResource(R.drawable.dice2);
        }
        if(randomNumver1 == 3){
            imageview1.setImageResource(R.drawable.dice3);
        }
        if(randomNumver1 == 4){
            imageview1.setImageResource(R.drawable.dice4);
        }
        if(randomNumver1 == 5){
            imageview1.setImageResource(R.drawable.dice5);
        }
        if(randomNumver1 == 6){
            imageview1.setImageResource(R.drawable.dice6);
        }}

    }


}