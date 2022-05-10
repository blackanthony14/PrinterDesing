package com.example.proyectododoantho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText mail,password;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth=FirebaseAuth.getInstance();
        mail=findViewById(R.id.edtTxtUSER);
        password=findViewById(R.id.edtTxtPASS);

    }

    public void Login(View view) {
        //Intent i = new Intent(Login.this,AlimentsMenu.class);
        //startActivity(i);
        loginUser();

    }

    public void GoRegister(View view) {
        Intent i = new Intent(Login.this,Register.class);
        startActivity(i);

    }
    private  void loginUser(){
        String correo= mail.getText().toString();
        String pass= password.getText().toString();
        if(TextUtils.isEmpty(correo)){
            mail.setError("EMAIL CANNOT BE EMPTY");
            mail.requestFocus();
        }else if(TextUtils.isEmpty(pass)) {
            password.setError("PASSWORD CANNOT BE EMPTY");
            password.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(correo,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){

                        Toast.makeText(getApplicationContext(),"USER CORRECTLY LOGGED IN",Toast.LENGTH_SHORT).show();
                        startActivity( new Intent(getApplicationContext(),AlimentsMenu.class));
                    }else{
                        Toast.makeText(getApplicationContext(),"LOGIN ERROR"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}