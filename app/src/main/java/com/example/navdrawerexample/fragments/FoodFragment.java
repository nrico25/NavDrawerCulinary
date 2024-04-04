package com.example.navdrawerexample.fragments;
// HomeFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawerexample.AdapterList;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    ArrayList<model> listKuliner = new ArrayList<>();

    public FoodFragment() {
        // Required empty public constructor
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvKuliner = view.findViewById(R.id.rvKuliner);

        listKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        listKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        listKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        listKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));
        listKuliner.add(new model("https://www.rus-animation.com/web/public/storage/team/team-6.jpg","Agam Amintaha","Kepala Sekolah & CEO RUS ANIMATION"));

        AdapterList adapter = new AdapterList(requireContext(), listKuliner, R.layout.item_layout);
        rvKuliner.setAdapter(adapter);
        rvKuliner.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_makanan, container, false);
    }
}
