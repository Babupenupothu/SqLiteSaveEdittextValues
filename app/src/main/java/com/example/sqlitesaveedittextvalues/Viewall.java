package com.example.sqlitesaveedittextvalues;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Viewall extends AppCompatActivity {

    Button show;
    DatabaseHelper database;
    RecyclerView recyclerView;
    RecycleAdapter recycler;
    List<DataModel> datamodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);


        datamodel =new ArrayList<DataModel>();
        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        database = new DatabaseHelper(Viewall.this);
        datamodel=  database.getdata();
        recycler =new RecycleAdapter(datamodel);

        Log.i("HIteshdata",""+datamodel);
        RecyclerView.LayoutManager reLayoutManager =new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(reLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recycler);

    }
}
