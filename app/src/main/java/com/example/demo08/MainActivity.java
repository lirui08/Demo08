package com.example.demo08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "新加的   dhfjk ", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "新加的   dhfjk ", Toast.LENGTH_SHORT).show();
    }
}