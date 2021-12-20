package com.example.uts_pbp_d_kelompok_4;

import android.content.Intent;

public class HotelAdapter {
    private int gambarHotel;
    private String jenisHotel;
    private String hargaHotel;

    public HotelAdapter(int gambarHotel, String jenisHotel, String hargaHotel){
        this.gambarHotel = gambarHotel;
        this.jenisHotel = jenisHotel;
        this.hargaHotel = hargaHotel;
    }
    public int getGambarHotel(){
        return gambarHotel;
    }
    public void setGambarHotel(int gambarHotel){
        this.gambarHotel =  gambarHotel;
    }
    public String getJenisHotel(){
        return jenisHotel;
    }
    public void  setJenisHotel (String jenisHotel){
        this.jenisHotel = jenisHotel;
    }
    public String getHargaHotel(){return  hargaHotel;}
    public void setHargaHotel(String hargaHotel){this.hargaHotel = hargaHotel;}


}
