package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recycleview.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] data;
    private String[] urls;
    private Context mContext;
    public MyAdapter(Context context, String[] data,String[] urls)
    {
        this.data=data;
        this.urls=urls;
        mContext=context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String title=data[position];
        holder.txtView.setText(title);
        Glide.with(mContext).load(urls[position]).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView txtView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.image_item);
            txtView = itemView.findViewById(R.id.text_item);
        }
    }
}
