package com.example.android.weatherapppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView_main);
        Weather weather1 = new Weather("1-Nov","25°","Sunny");

        System.out.println(weather1.getDate());
        weather1.setDate("2-Nov");
        System.out.println(weather1.getDate());


    }
}
