package com.developer.multiscreening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

       String[] englishWords = new String[10];
        englishWords[0] = "One"; englishWords[1] = "Two"; englishWords[2] = "Three"; englishWords[3] = "Four"; englishWords[4] = "Five";
        englishWords[5] = "Six"; englishWords[6] = "Seven"; englishWords[7] = "Eight"; englishWords[8] = "Nine"; englishWords[9] = "Ten";



    }

}
