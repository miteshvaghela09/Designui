package com.example.designui.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designui.R;

import java.util.ArrayList;

public class DataAdapter extends  RecyclerView.Adapter<DataAdapter.DataViewholder>{
    private ArrayList<Data> alldata;

    public DataAdapter(ArrayList<Data> alldata) {
        this.alldata = alldata;
    }

    @NonNull
    @Override
    public DataViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design2,parent,false);
        DataViewholder holder = new DataViewholder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewholder holder, int position) {
        Data card1 = alldata.get(position);
        holder.name.setText(card1.getCardname());
        holder.desc.setText(card1.getCarddesc());
        holder.imagecard.setImageResource(card1.getImageone());

    }

    @Override
    public int getItemCount() {
        return alldata.size();
    }

    public static class DataViewholder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView desc;
        public ImageView imagecard;
        public DataViewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.cardname);
            desc= itemView.findViewById(R.id.carddesc);
            imagecard= itemView.findViewById(R.id.cardimage);

        }
    }
}
