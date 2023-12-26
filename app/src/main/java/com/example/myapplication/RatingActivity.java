package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RatingActivity extends AppCompatActivity {
    String[] rusi = {"5, 4, 5, 5"};
    String[] bioi= {"5, 3, 5, 5"};
    String[] fizi= {"3, 3, 4, 4"};
    String[] geoi = {"5, 5, 5, 5"};
    String[] angli = {"5, 4, 4, 5"};
    String[] fizrai = {"5, 5, 5, 5"};
    String[] infi = {"5, 4, 3, 5"};
    String[] himi = {"3, 4, 3, 5"};
    String[] liti = {"5, 4, 5, 3"};
    String[] mati = {"5, 4, 5, 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        // русский
        ListView rusA = findViewById(R.id.rus);
        ArrayAdapter<String> RusL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, rusi);
        rusA.setAdapter(RusL);

        ListView LitA = findViewById(R.id.lit);
        ArrayAdapter<String> Lit = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, liti);
        LitA.setAdapter(Lit);

        ListView FizA = findViewById(R.id.fiz);
        ArrayAdapter<String> fizL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, rusi);
        FizA.setAdapter(fizL);

        ListView himA = findViewById(R.id.him);
        ArrayAdapter<String> himL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, himi);
        himA.setAdapter(himL);

        ListView anglA = findViewById(R.id.angl);
        ArrayAdapter<String> anglL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, angli);
        anglA.setAdapter(anglL);

        ListView matA = findViewById(R.id.mat);
        ArrayAdapter<String> matL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, mati);
        matA.setAdapter(matL);

        ListView bioA = findViewById(R.id.bio);
        ArrayAdapter<String> bioL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, bioi);
        bioA.setAdapter(bioL);

        ListView infA = findViewById(R.id.inf);
        ArrayAdapter<String> infL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, infi);
        infA.setAdapter(infL);

        ListView fizraA = findViewById(R.id.fizra);
        ArrayAdapter<String> fizraL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, fizrai);
        fizraA.setAdapter(fizraL);

        ListView geoA = findViewById(R.id.geo);
        ArrayAdapter<String> geoL = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, geoi);
        geoA.setAdapter(geoL);
    }
}