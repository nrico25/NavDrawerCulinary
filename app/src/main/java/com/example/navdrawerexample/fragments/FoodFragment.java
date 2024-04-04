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

        listKuliner.add(new model("https://assets.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/05/20/Soto-ayam-2742975645.jpg","Soto Tamanan","Soto daging sapi yang khas dengan kuah bening dan rasa gurih"));
        listKuliner.add(new model("https://img-global.cpcdn.com/recipes/883ad7870bb552ad/400x400cq70/photo.jpg","Sego Pecel Tumpang","Pecel yang khas dengan bumbu kacang yang gurih dan pedas"));
        listKuliner.add(new model("https://asset-2.tstatic.net/tribunnews/foto/bank/images/ilustrasi-sate-emprit-kediri.jpg","Sate Emprit","Sate emprit adalah sate yang terbuat dari burung pipit"));
        listKuliner.add(new model("https://asset.kompas.com/crops/l3xnQh1pGb-JXXnQlqwMVzdfRMo=/0x0:1000x667/750x500/data/photo/2022/12/25/63a7a3ef59ddd.jpeg","Gethuk Pisang","Makanan tradisional yang terbuat dari pisang dan singkong. Gethuk pisang memiliki rasa yang manis dan legit."));
        listKuliner.add(new model("https://cdn.idntimes.com/content-images/community/2022/09/271869163-634634954405267-3344387539790195534-n-f4b5546b6c8b5ac8354c09ba85227994-507dc878d77e0d37fa5903513722a50c.jpg","Nasi Mawut","Nasi goreng dengan mie yang digoreng menggunakan arang dengan bumbu yang gurih"));
        listKuliner.add(new model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdnv9hbQOncV0w5cmJQ9Lr5d7kXKQDZRIJFMzFnKzFoP7GTkO3tqp6KWLfoa43","Sate Bekicot","Sate bekicot adalah sate yang terbuat dari bekicot"));
        listKuliner.add(new model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGcoJje5A4YugKLb85cBZoz2JxxacUJML9qmf9XpILZhEgnuiWlxdd90I_0Xg8","Tahu Poo","Tahu goreng yang terbuat dari kacang kedelai dan tepung tapioka"));
        listKuliner.add(new model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6E866WEdK1a7iUFMJj0Hml1nAi5wV3vnYFUxvyBzmvtgOMck9xYmnA-j0ciFf","Krupuk Upil","Krupuk upil adalah kerupuk yang terbuat dari singkong"));




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
