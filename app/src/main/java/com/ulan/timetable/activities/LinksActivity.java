package com.ulan.timetable.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ulan.timetable.R;

public class LinksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
    }

    public void LinkedIn (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/"));
        startActivity(browserIntent);

    }

    public void Facebook (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);

    }

    public void Instagram (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(browserIntent);

    }

}

