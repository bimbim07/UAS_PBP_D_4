package com.example.uts_pbp_d_kelompok_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.uts_pbp_d_kelompok_4.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Button profile, cari, logout, lokasi;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        profile       = findViewById(R.id.btnProfile);
        cari       = findViewById(R.id.btnCari);
        logout    = findViewById(R.id.btnLogout);
        lokasi    = findViewById(R.id.btnLokasi);

        setupNavigation();
    }

    private void loadFragment(SearchHotel searchHotel) {
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
    }

    private void setupNavigation() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.navigation_menu);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
    }


}