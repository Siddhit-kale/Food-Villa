package com.example.onlinemenu.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.onlinemenu.Models.Mainmodels;
import com.example.onlinemenu.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Mainadapter extends RecyclerView.Adapter<Mainadapter.ViewHolder>{

    ArrayList<Mainmodels> list;
    Context context;

    public Mainadapter(ArrayList<Mainmodels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.simple_order,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        final Mainmodels model = list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.foodname.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.desc.setText(model.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detail.class);
                intent.putExtra("image", model.getImage());
                intent.putExtra("price", model.getPrice());
                intent.putExtra("desc", model.getDescription());
                intent.putExtra("name", model.getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView foodname,price,desc;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            foodimage = itemView.findViewById(R.id.foodimage);
            foodname = itemView.findViewById(R.id.foodname);
            price = itemView.findViewById(R.id.price);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
