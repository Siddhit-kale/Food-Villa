package com.example.onlinemenu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.onlinemenu.Models.Ordermodel;
import com.example.onlinemenu.R;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class Orderadapter extends RecyclerView.Adapter<Orderadapter.viewHolder>{

    ArrayList<Ordermodel> list;
    Context context;

    public Orderadapter(ArrayList<Ordermodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewHolder holder, int position) {
        final Ordermodel model = list.get(position);
        holder.orderimage.setImageResource(model.getOrderimage());
        holder.solditemname.setText(model.getSolditemname());
        holder.orderno.setText(model.getOrderno());
        holder.price.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView orderimage;
        TextView solditemname, orderno, price;


        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            orderimage = itemView.findViewById(R.id.orderimage);
            solditemname = itemView.findViewById(R.id.ordername);
            orderno = itemView.findViewById(R.id.orderno);
            price = itemView.findViewById(R.id.orderprice);

        }
    }
}
