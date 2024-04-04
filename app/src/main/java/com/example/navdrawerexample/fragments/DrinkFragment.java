package com.example.navdrawerexample.fragments;
// HomeFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawerexample.AdapterList;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {
    ArrayList<model> ListKuliner = new ArrayList<>();

    public DrinkFragment() {

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvKuliner = view.findViewById(R.id.rvKuliner);
        ListKuliner= new ArrayList<>();

        ListKuliner.add(new model("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSSU953PFaZKOxzpgUUfMimAKctWi_ebKeHsOL9yyULjoB_ee3ciqg_Pjpq_iI6","Es Dawet Ireng","Es dawet ireng yang terbuat dari tepung ketan hitam, santan, gula merah cair, dan es serut"));
        ListKuliner.add(new model("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRzeF6HcUP4o2ItwsfrBPw-KOtsnCAi7Px-jFbAQ8dzLR0I2RT7rRJc1QhVg-uK","Bir Jawa","Minuman ini memiliki rasa yang pedas dan manis, serta aroma yang hangat dan harum"));
        ListKuliner.add(new model("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQmtPaVaz5mqsy6w0GS_IKTHxqWEb0F_27FdF_-39K-TYr6OkwBd8e2CFcifO56","Susu Jahe","Susu jahe adalah minuman khas Jawa Timur yang terbuat dari susu, jahe, dan gula merah"));
        ListKuliner.add(new model("https://fajar.co.id/wp-content/uploads/2023/09/IMG_0741.jpg","Es Teh"," Es teh adalah minuman yang sering diminum saat siang hari karena suhu udara yang panas."));
        ListKuliner.add(new model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnA1x4ZOAnDUKz2oTD5UqE0KVDA972O7rvmnHic729oQ&s","Es Jeruk","Mengonsumsi es jeruk murni bisa membantu anda dalam memenuhi kebutuhan vitamin C"));

        rvKuliner.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterList adapter = new AdapterList(getContext(),ListKuliner, R.layout.item_layout);
        rvKuliner.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_minuman, container, false);
    }
}
