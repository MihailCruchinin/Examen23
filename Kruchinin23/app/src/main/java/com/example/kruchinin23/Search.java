package com.example.kruchinin23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void BackToArea(View v)
    {
        Intent i;
        i = new Intent(this, PersonalArea.class);
        startActivity(i);
    }
}