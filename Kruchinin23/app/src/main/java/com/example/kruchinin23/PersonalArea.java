package com.example.kruchinin23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PersonalArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
    }
    public void Back(View v)
    {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void Search(View v)
    {
        Intent i;
        i = new Intent(this, Search.class);
        startActivity(i);
    }
    public void Call(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+79016714574"));
        startActivity(intent);
    }
}