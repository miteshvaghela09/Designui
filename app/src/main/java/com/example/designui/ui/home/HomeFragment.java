package com.example.designui.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designui.R;
import com.example.designui.models.CardAdapter;
import com.example.designui.models.CardClass;
import com.example.designui.models.Data;
import com.example.designui.models.DataAdapter;

import java.util.ArrayList;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager manager;
    ArrayList<CardClass> carddar = new ArrayList<>();

    public RecyclerView recyclerView2;
    public RecyclerView.Adapter adapter2;
    public RecyclerView.LayoutManager manager2;
    ArrayList<Data> alldata = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        recyclerView =root.findViewById(R.id.recyclerview1);
        manager = new LinearLayoutManager(getContext(), HORIZONTAL,false);
        adapter = new CardAdapter(carddar);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        carddar.add(new CardClass("Mitesh Vaghela","525","425",R.drawable.city1));
        carddar.add(new CardClass("Anand Shrivastava","525","425",R.drawable.city2));
        carddar.add(new CardClass("The Beast","525","425",R.drawable.city3));
        carddar.add(new CardClass("The Game","55","425",R.drawable.city4));


        recyclerView2 =root.findViewById(R.id.recyclerview2);
        manager2 = new LinearLayoutManager(getContext(), HORIZONTAL,false);
        adapter2 = new DataAdapter(alldata);

        recyclerView2.setLayoutManager(manager2);
        recyclerView2.setAdapter(adapter2);
        alldata.add(new Data(R.drawable.car1,"Mitesh","Android Developer"));
        alldata.add(new Data(R.drawable.car2,"Anand","Flutter Developer"));
        alldata.add(new Data(R.drawable.car3,"Viren","Java Developer"));
        alldata.add(new Data(R.drawable.car4,"Kamlesh","Hacker Developer"));
        alldata.add(new Data(R.drawable.car1,"Game","Developer"));
        alldata.add(new Data(R.drawable.car2,"Harmit","PHP Developer"));
        alldata.add(new Data(R.drawable.car3,"Nirmal","Laravel Developer"));
        alldata.add(new Data(R.drawable.car4,"Ridhesh","Scientist"));


        return root;
    }
}