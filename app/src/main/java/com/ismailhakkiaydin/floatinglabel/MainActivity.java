package com.ismailhakkiaydin.floatinglabel;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private TextInputLayout inputLayoutName, inputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        inputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    private boolean dogrulaAd(){

        if(etUsername.getText().toString().isEmpty()){
            inputLayoutName.setError("Kullanıcı adı boş olmamalı");
            return false;
        } else{
            inputLayoutName.setErrorEnabled(false);
            return true;

        }


    }

    private boolean dogrulaSifre(){

        String parola=etPassword.getText().toString().trim();
        if(parola.length() <6){

            inputLayoutPassword.setError("Parola min 6 karakter olmalı");
            return false;

        }else{

            inputLayoutPassword.setErrorEnabled(false);
            return true;

        }


    }

    public void girisDogrula(View view){

        if(dogrulaAd() && dogrulaSifre()){

            Toast.makeText(this, "Giriş yapıldı ", Toast.LENGTH_LONG).show();

        }

    }


}