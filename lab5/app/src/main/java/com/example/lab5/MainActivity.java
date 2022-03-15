package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView  lvDonut;
    DonutAdapter donutAdapter ;
    ArrayList<Donut> donuts ;
    ArrayList<Donut> ArrSearchdonut;
    Button btnSearch;
    EditText editextSr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDonut = findViewById(R.id.listviewdonut);
        donuts = new ArrayList<>();
        ArrSearchdonut = new ArrayList<>();
        donuts.add( new Donut("Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.donut_yellow_1));
        donuts.add( new Donut("Pink Donut","Spicy tasty donut family","$20.00",R.drawable.tasty_donut_1));
        donuts.add( new Donut("Floating Donut","Spicy tasty donut family","$30.00",R.drawable.green_donut_1));
        donuts.add( new Donut("Tasty Donut","ngon thế nhờ","$100.00",R.drawable.donut_red_1));
        donutAdapter = new DonutAdapter(this,R.layout.donut1dong,donuts);

        lvDonut.setAdapter(donutAdapter);
//        btnSearch.findViewById(R.id.btnSearch);
//        editextSr.findViewById(R.id.txtsearch);
//
//        btnSearch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ArrSearchdonut.clear();
//                for (Donut donut:donuts) {
//                    String s = editextSr.getText().toString();
//                    if(donut.getName().contains(s)){
//                        ArrSearchdonut.add(donut);
//                    }
//                }
//                lvDonut.setAdapter(new DonutAdapter(MainActivity.this,R.layout.donut1dong,ArrSearchdonut));
//            }
//        });
   


    }
}