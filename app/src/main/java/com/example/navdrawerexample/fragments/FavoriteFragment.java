package com.example.navdrawerexample.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerexample.AdapterList;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {
    ArrayList<model> ListKuliner = new ArrayList<>();


    public FavoriteFragment() {

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvKuliner = view.findViewById(R.id.rvKuliner);
        ListKuliner= new ArrayList<>();

        ListKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        ListKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        ListKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        ListKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        ListKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));

        rvKuliner.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterList adapter = new AdapterList(getContext(),ListKuliner, R.layout.item_layout);
        rvKuliner.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }
}