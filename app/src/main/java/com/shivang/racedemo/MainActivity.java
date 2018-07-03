package com.shivang.racedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shivang.racedemo.Adapters.RecyclerAdapters;
import com.shivang.racedemo.Models.Race;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView recyclerlist;
    List<Race> list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponents();
        list=new ArrayList<>();
        Race race1=new Race("Test Race","Suzuki","07/072018 00:10:55","2","Normal","20 KMs","N/A");
        Race race2=new Race("Test Race1","Suzuki","07/072018 00:10:55","2","Normal","20 KMs","N/A");
        Race race3=new Race("Test Race2","Suzuki","07/072018 00:10:55","2","Normal","20 KMs","N/A");
        Race race4=new Race("Test Race3","Suzuki","07/072018 00:10:55","2","Normal","20 KMs","N/A");

        list.add(race1);
        list.add(race2);
        list.add(race3);
        list.add(race4);

        recyclerlist.setLayoutManager(new LinearLayoutManager(this));
        recyclerlist.setAdapter(new RecyclerAdapters(getApplicationContext(),list));
    }

    private void setComponents()
    {
        recyclerlist=findViewById(R.id.recyler_list);
    }
}
