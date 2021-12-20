package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_pbp_d_kelompok_4.SearchHotel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView tanggal_pesan = findViewById(R.id.tanggal_pesan);
        TextView edUsernamereg = findViewById(R.id.edUsername);
        TextView edFullname = findViewById(R.id.edFullname);
        TextView harga = findViewById(R.id.btnHarga);

        tanggal_pesan.setText(getIntent().getStringExtra("cekin") + " - " + getIntent().getStringExtra("cekout"));

        edUsernamereg.setText(getIntent().getStringExtra(""));

        edFullname.setText(getIntent().getStringExtra(""));
    }
}