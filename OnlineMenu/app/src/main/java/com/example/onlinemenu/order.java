package com.example.onlinemenu;

import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.onlinemenu.Adapter.Orderadapter;
import com.example.onlinemenu.Models.Ordermodel;
import com.example.onlinemenu.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class order extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Ordermodel> list=new ArrayList<>();
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));
        list.add(new Ordermodel(R.drawable.burger,"VEG BURGAR","RS. 50","01"));

        Orderadapter adapter= new Orderadapter(list,this);
        binding.orderres.setAdapter(adapter);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this);
        binding.orderres.setLayoutManager(LayoutManager);

    }
}