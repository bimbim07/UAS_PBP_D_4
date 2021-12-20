package com.example.uts_pbp_d_kelompok_4.UnitTesting;

import com.example.uts_pbp_d_kelompok_4.SignIn;


public class ProfilService {

    //    TODO 6: silahkan salin code ProfilService

//    public void profil(final com.example.uts_pbp_d_kelompok_4.UnitTesting.ProfilView view, SignIn signIn, final
//    ProfilCallback callback)
//    {
//        ApiInterface apiService =
//                ApiClient.getClient().create(ApiInterface.class);
//        Call<ProfilResponse> profilDAOCall =
//                apiService.createProfil(profil);
//        profilDAOCall.enqueue(new Callback<ProfilResponse>() {
//            @Override
//            public void onResponse(Call<ProfilResponse> call,
//                                   Response<ProfilResponse> response) {
//
//                if(response.body().getMessage().equalsIgnoreCase("berhasil daftar"
//                )){
//                    callback.onSuccess(true,
//                            response.body().getProfilList().get(0));
//                }
//                else{
//                    callback.onError();
//                    view.showProfilError(response.body().getMessage());
//                }
//            }
//            @Override
//            public void onFailure(Call<ProfilResponse> call, Throwable
//                    t) {
//                view.showErrorResponse(t.getMessage());
//                callback.onError();
//            }
//        });
//    }
//    public Boolean getValid(final com.example.gd12_d_0112.UnitTesting.ProfilView view, Profil profil) {
//        final Boolean[] bool = new Boolean[1];
//        profil(view, profil, new ProfilCallback() {
//            @Override
//            public void onSuccess(boolean value, Profil profil) {
//                bool[0] = true;
//            }
//            @Override
//            public void onError() {
//                bool[0] = false;
//            }
//        });
//        return bool[0];
//    }

}
