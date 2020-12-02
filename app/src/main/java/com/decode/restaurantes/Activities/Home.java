package com.decode.restaurantes.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.decode.restaurantes.Adapter.HomeAdapter;
import com.decode.restaurantes.R;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView= findViewById(R.id.recycleHome);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        HomeAdapter homeAdapter= new HomeAdapter();
        recyclerView.setAdapter(homeAdapter);
    }
}
