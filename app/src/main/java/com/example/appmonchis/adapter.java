package com.example.appmonchis;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.myViewHolder> {


    Context mContext;
    List<item> aData;


    public adapter(Context mContext, List<item> aData) {
        this.mContext = mContext;
        this.aData = aData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.cart_item, parent, false);



        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.backgraund_img.setImageResource(aData.get(position).getBackground());
        holder.profilePhoto.setImageResource(aData.get(position).getProfilePhoto());
        holder.tv_title.setText(aData.get(position).getProfileName());
        holder.tv_nbFollowers.setText(aData.get(position).getNbFollowers()+ "En stock");




    }

    @Override
    public int getItemCount() {
        return aData.size();
    }

    public class  myViewHolder extends RecyclerView.ViewHolder{
        ImageView profilePhoto, backgraund_img;
        TextView tv_title, tv_nbFollowers;

        public myViewHolder(View itemView) {
            super(itemView);

            profilePhoto = itemView.findViewById(R.id.profile_img);
            backgraund_img = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_nbFollowers = itemView.findViewById(R.id.card_description);

        }
    }


}