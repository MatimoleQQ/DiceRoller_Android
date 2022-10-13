package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Integer wylosowanaLiczba; //Musi byc Integer bo inaczej nei mozna uzywac metod
    public ArrayList<Integer> obrazkiKosci = new ArrayList<>();

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        obrazkiKosci.add(R.drawable.dice_1);
        obrazkiKosci.add(R.drawable.dice_2);
        obrazkiKosci.add(R.drawable.dice_3);
        obrazkiKosci.add(R.drawable.dice_4);
        obrazkiKosci.add(R.drawable.dice_5);
        obrazkiKosci.add(R.drawable.dice_6);
        setContentView(R.layout.activity_main);
        Button diceButton = findViewById(R.id.button);
        TextView diceTextView = findViewById(R.id.diceTextId);
//              ImageView img = findViewById(R.id.imageView)
//        img.setImageResource(R.drawable.;


        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wylosowanaLiczba = (int)(Math.random()*6+1);
                diceTextView.setText(wylosowanaLiczba.toString());
                String nazwa = "dice_"+wylosowanaLiczba.toString();




            }
        });
    }
}