package com.example.navdrawerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    Context context;
    List<model> listData;
    private int layout;

    public AdapterList(Context context, List<model> listData, int layout) {
        this.context = context;
        this.listData = listData;
        this.layout = layout;
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ViewHolder holder, int position) {
        model itemsDatar = listData.get(position);
        holder.nameItems.setText(itemsDatar.getNameItems());
        holder.desItems.setText(itemsDatar.getDesItems());
        Glide.with(holder.imgUrl).load(itemsDatar.getImgUrl()).into(holder.imgUrl);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgUrl;
        TextView nameItems;

        TextView desItems;

        public ViewHolder(View view) {
            super(view);
            nameItems = view.findViewById(R.id.tvItems);
            imgUrl = view.findViewById(R.id.ivItems);
            desItems = view.findViewById(R.id.tvDescription);

        }
    }
}
