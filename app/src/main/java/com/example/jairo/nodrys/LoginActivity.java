package com.example.jairo.nodrys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jairo.nodrys.view.CrearCuentaActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void crearcuentaaqui(View view) {
        Intent intent_crear_cuenta = new Intent(this, CrearCuentaActivity.class);
        startActivity(intent_crear_cuenta);
    }
}
