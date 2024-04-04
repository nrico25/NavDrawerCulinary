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

        ListKuliner.add(new model("https://media-order.bkdelivery.co.id/thumb/product_photo/2023/4/5/aejbbuckm3mna64rexhdbq_product_details.jpg","double cheeseburger","Burger keju adalah hamburger yang disisipi keju"));
        ListKuliner.add(new model("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSSU953PFaZKOxzpgUUfMimAKctWi_ebKeHsOL9yyULjoB_ee3ciqg_Pjpq_iI6","Es Dawet Ireng","Es dawet ireng yang terbuat dari tepung ketan hitam"));
        ListKuliner.add(new model("https://img-global.cpcdn.com/recipes/883ad7870bb552ad/400x400cq70/photo.jpg","Sego Pecel Tumpang","Pecel yang khas dengan bumbu kacang yang gurih dan pedas."));
        ListKuliner.add(new model("https://asset-2.tstatic.net/tribunnews/foto/bank/images/ilustrasi-sate-emprit-kediri.jpg","Sate Emprit","Sate emprit adalah sate yang terbuat dari burung pipit"));
        ListKuliner.add(new model("https://asset.kompas.com/crops/l3xnQh1pGb-JXXnQlqwMVzdfRMo=/0x0:1000x667/750x500/data/photo/2022/12/25/63a7a3ef59ddd.jpeg","Gethuk Pisang","Makanan tradisional yang terbuat dari pisang dan singkong"));


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