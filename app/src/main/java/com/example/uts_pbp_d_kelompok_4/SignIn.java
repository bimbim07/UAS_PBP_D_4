package com.example.uts_pbp_d_kelompok_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {

    EditText edusername, edpassword;
    Button btnsubmit;
    TextView eddaftar;
    boolean isUsernameValid, isPasswordValid;
    TextInputLayout usernameError, passwordError;

    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        firebaseAuth=FirebaseAuth.getInstance();
        edusername = findViewById(R.id.edusername);
        edpassword = findViewById(R.id.edpassword);
        btnsubmit  = findViewById(R.id.btnsubmit);
        eddaftar   = findViewById(R.id.textdaftar);
        usernameError = findViewById(R.id.usernameError);
        passwordError = findViewById(R.id.passwordError);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValidation();
            }
        });
        eddaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(SignIn.this, SignUp.class);
                startActivity(daftar);
            }
        });
    }

    public void SetValidation() {
        if (edusername.getText().toString().isEmpty()) {
            usernameError.setError(getResources().getString(R.string.username_error));
            isUsernameValid = false;
//        } else if(edusername.){
        } else {
            isUsernameValid = true;
            usernameError.setErrorEnabled(false);
        }

        if (edpassword.getText().toString().isEmpty()) {
            passwordError.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else {
            isPasswordValid = true;
            passwordError.setErrorEnabled(false);
        }

        if (isUsernameValid && isPasswordValid) {
            firebaseAuth.signInWithEmailAndPassword(edusername.getText().toString(),edpassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        firebaseUser = firebaseAuth.getCurrentUser();
                        if(firebaseUser.isEmailVerified()){
                            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignIn.this, SearchHotel.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(getApplicationContext(), "Belum Verivikasi Email COK !", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}