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
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.NewsHolder>{
    private ArrayList<CardClass> carddata;


    public CardAdapter(ArrayList<CardClass> carddata) {
        this.carddata = carddata;
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        NewsHolder holder = new NewsHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder holder, int position) {
        CardClass card1 = carddata.get(position);
        holder.name.setText(card1.getName());
        holder.posts.setText(card1.getPosts());
        holder.likes.setText(card1.getLikes());
        holder.image.setImageResource(card1.getImage());

    }

    @Override
    public int getItemCount() {
        return carddata.size();
    }

    public static class NewsHolder extends RecyclerView.ViewHolder {


        public TextView name;
        public TextView posts;
        public TextView likes;
        public ImageView image;

        public NewsHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name1);
            posts= itemView.findViewById(R.id.posts);
            likes= itemView.findViewById(R.id.likes);
            image= itemView.findViewById(R.id.image);

        }
    }
}
