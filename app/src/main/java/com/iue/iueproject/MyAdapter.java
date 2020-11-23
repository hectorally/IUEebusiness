package com.iue.iueproject;

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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<AdminRegclass> listData;
    private Context mContext;


    public MyAdapter(Context context, List<AdminRegclass> listData) {
        this.listData = listData;
        this.mContext = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data,parent,false);
        View view= LayoutInflater.from(mContext).inflate(R.layout.list_data,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AdminRegclass ld=listData.get(position);
        holder.txtid.setText(ld.getBusinessName());
        holder.txtname.setText(ld.getUserName());
        holder.txtmovie.setText(ld.getEmail());
        Glide.with(mContext).load(ld.getuSerimageURL()).into(holder.mImageIv);
      // Picasso.get().load(ld.getuSerimageURL()).into(holder.mImageIv);
        //Picasso.get().load(ld.getuSerimageURL()).into(holder.mImageIv);
        //.mImageIv.setImageResource(String.valueOf(.valueOf(ld.getuSerimageURL().getBytes()))); //image
       // int intVal = Integer.valueOf(String.valueOf(ld.getuSerimageURL.getValue()));


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtid,txtname,txtmovie;
        private ImageView mImageIv;

        public ViewHolder(View itemView) {
            super(itemView);
            txtid=(TextView)itemView.findViewById(R.id.idtxt);
            txtname=(TextView)itemView.findViewById(R.id.nametxt);
            txtmovie=(TextView)itemView.findViewById(R.id.movietxt);
             mImageIv=(ImageView)itemView.findViewById(R.id.rImageView);
              

        }
    }
}