package com.example.uts_pbp_d_kelompok_4.UnitTesting;

import android.content.Context;
import android.content.Intent;

import com.example.uts_pbp_d_kelompok_4.SignIn;

public class ActivityUtil {
//    TODO 3: silahkan salin code ActivityUtil

    private Context context;
    public ActivityUtil(Context context) {
        this.context = context;
    }
    public void startmainSignIn() {
        context.startActivity(new Intent(context, SignIn.class));
    }

}
