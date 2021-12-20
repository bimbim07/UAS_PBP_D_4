package com.example.uts_pbp_d_kelompok_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvHotelAdapter extends RecyclerView.Adapter<RvHotelAdapter.RecycleViewHolder> {
    private ArrayList<HotelAdapter> mhotelAdapters = new ArrayList<>();
    private OnHotelListener mOnHotelListener;


    public RvHotelAdapter(ArrayList<HotelAdapter>hotelAdapter, OnHotelListener onHotelListener){
        this.mhotelAdapters = hotelAdapter;
        this.mOnHotelListener = onHotelListener;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_hotel,parent,false);
        RvHotelAdapter.RecycleViewHolder holder = new RvHotelAdapter.RecycleViewHolder(view, mOnHotelListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position){
        HotelAdapter item = mhotelAdapters.get(position);
        holder.imageView.setImageResource(item.getGambarHotel());
        holder.jenisHotel.setText(item.getJenisHotel());
        holder.hargahotel.setText(item.getHargaHotel());
    }

    @Override
    public int getItemCount(){
        return mhotelAdapters.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView jenisHotel, hargahotel;

        OnHotelListener onHotelListener;

        public RecycleViewHolder(@NonNull View itemView, OnHotelListener onHotelListener){
            super(itemView);
            imageView = itemView.findViewById(R.id.rvHotel);
            jenisHotel  = itemView.findViewById(R.id.tvJenisKamar);
            hargahotel = itemView.findViewById(R.id.tvHargaHotel);
            this.onHotelListener = onHotelListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onHotelListener.onHotelClick(getAdapterPosition());
        }
    }

    public interface OnHotelListener{
        void onHotelClick(int position);
    }
}
