package com.example.onlinemenu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.onlinemenu.Adapter.Mainadapter;
import com.example.onlinemenu.Models.Mainmodels;
import com.example.onlinemenu.databinding.ActivityMainBinding;
import com.example.onlinemenu.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class menu extends AppCompatActivity {

    ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Mainmodels> list = new ArrayList<>();
        list.add(new Mainmodels(R.drawable.burger,"BURGAR", "RS. 50", "With Cold Drink and FranchFries"));
        list.add(new Mainmodels(R.drawable.pizza,"PIZZA", "RS. 70", "With EXTRA CHEESS"));
        list.add(new Mainmodels(R.drawable.pngitem_5575094,"SAMOSA", "RS. 10", "With EXTRA Chatni"));
        list.add(new Mainmodels(R.drawable.clipart1885381,"TEA", "RS. 10", "Special Morning Tea"));
        list.add(new Mainmodels(R.drawable.dosa,"DOSA", "RS. 35", "With Extra Chatni and sambhar"));
        list.add(new Mainmodels(R.drawable.idli,"IDLI", "RS. 20", "With Extra Chatni and Sambhar"));
        list.add(new Mainmodels(R.drawable.paneerhandi,"PANEER HANDI", "RS. 120", "With Paneer and 5 Roti"));
        list.add(new Mainmodels(R.drawable.pannermasala,"PANEER MASALA", "RS. 130", "With Extra masala and paneer"));
        list.add(new Mainmodels(R.drawable.jeera_rice_2_3_1,"PANEER MASALA", "RS. 90", "With DAL FRY"));

        Mainadapter adapter= new Mainadapter(list,this);
        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}