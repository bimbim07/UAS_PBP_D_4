package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchHotel extends AppCompatActivity implements RvHotelAdapter.OnHotelListener{
    private RecyclerView recyclerView;
    private RvHotelAdapter adapter;
    private RecyclerView.LayoutManager manager;

    private ArrayList<HotelAdapter> mHotelAdapter = new ArrayList();
    private RvHotelAdapter.OnHotelListener mOnHotelListener;

    Button lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hotel);

        lokasi  = findViewById(R.id.btnLokasi);

        ArrayList<HotelAdapter> mHotelAdapter = new ArrayList<>();
        mHotelAdapter.add(new HotelAdapter(R.drawable.single, "Single", "Rp.500.000"));
        mHotelAdapter.add(new HotelAdapter(R.drawable.duo, "Duo", "Rp.1.000.000"));
        mHotelAdapter.add(new HotelAdapter(R.drawable.family, "Family", "Rp.1.500.000"));

        recyclerView = findViewById(R.id.rvHotel);
        recyclerView.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        adapter = new RvHotelAdapter(mHotelAdapter, this);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lokasi = new Intent(SearchHotel.this, LokasiActivity.class);
                startActivity(lokasi);
            }
        });
    }

    @Override
    public void onHotelClick(int position) {
        Intent intent = new Intent(this, HalamanUtama.class);
        startActivity(intent);
    }


}