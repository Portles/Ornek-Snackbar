package com.example.deneme1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int redColorValue = Color.RED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  Snackbar1(View view){
        Snackbar snackbar = Snackbar.make(view, "Ben Bilgilendirici Bir Snackbarım!", Snackbar.LENGTH_SHORT);
        snackbar.setTextColor(redColorValue);
        snackbar.show();
    }
    public void  Snackbar2(View view){
        Snackbar snackbar = Snackbar.make(view, "HATA", Snackbar.LENGTH_INDEFINITE);
        snackbar.setBackgroundTint(redColorValue);
        snackbar.show();
    }
    public void  Snackbar3(View view){
        Snackbar snackbar = Snackbar.make(view, "Ben Tuşlu Bir Snackbarım!", Snackbar.LENGTH_LONG);
        snackbar.setTextColor(redColorValue);
        snackbar.setAction("TUŞ",new Listener());
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.show();
    }
    public class Listener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

        }
    }
}