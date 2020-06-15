package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list=findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        String[] lang={"Cheese", "Pepperoni", "Black Olives","Cheese", "Pepperoni", "Black Olives"};
        String[] urls={"https://cdn.pixabay.com/photo/2016/12/26/17/28/food-1932466_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2010/12/13/10/05/background-2277_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2017/01/31/09/30/raspberry-2023404__340.jpg",
                        "https://cdn.pixabay.com/photo/2014/04/07/05/25/gummibarchen-318362__340.jpg",
                        "https://cdn.pixabay.com/photo/2017/05/07/19/32/strawberry-2293337__340.jpg",
                        "https://cdn.pixabay.com/photo/2016/03/10/18/44/top-view-1248955__340.jpg"};
        list.setAdapter(new MyAdapter(this,lang,urls));
    }
}
