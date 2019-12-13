package com.example.denvatobookmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button btnSeeAll,btnCurrentlyReading,btnAlreadyRead,btnAbout,btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
    }

    private void initWidgets()
    {
        btnSeeAll = (Button) findViewById(R.id.btnAllBooks);
        btnCurrentlyReading = (Button) findViewById(R.id.btnCRBooks);
        btnAlreadyRead = (Button) findViewById(R.id.btnARBooks);
        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnExit = (Button) findViewById(R.id.btnExit);
    }

    public void seeAllBooks(View view)
    {
        Intent intent  = new Intent(MainActivity.this,AllBooksActivity.class);
        startActivity(intent);
    }
}
