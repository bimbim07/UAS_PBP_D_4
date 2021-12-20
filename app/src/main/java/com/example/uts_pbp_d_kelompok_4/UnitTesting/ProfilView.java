package com.example.uts_pbp_d_kelompok_4.UnitTesting;

public interface ProfilView {

    //    TODO 5: silahkan salin code ProfilView

    String getEmail();
    void showEmailError(String message);

    String getPassword();
    void showPasswordError(String message);

    void startMainSignIn();

    void showSignInError(String message);
    void showErrorResponse (String message);
}
