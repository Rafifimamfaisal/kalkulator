package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PersegiPanjang (View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PersegiPanjang()).commit();
    }
    public void Segitiga (View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Segitiga()).commit();
    }
    public void Lingkaran (View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Lingkaran()).commit();
    }
}