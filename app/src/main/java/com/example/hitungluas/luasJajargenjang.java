package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luasJajargenjang extends AppCompatActivity {

    private Button btnVolume;
    private EditText etAlas,etTinggi;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_jajargenjang);

        btnVolume = findViewById(R.id.btnVolume);
        tvHasil = findViewById(R.id.tvHasil);
        etAlas = findViewById(R.id.etAlas);
        etTinggi = findViewById(R.id.etTinggi);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double alas = Double.parseDouble(etAlas.getText().toString());
                Double tinggi = Double.parseDouble(etTinggi.getText().toString());

                Double hasil = alas * tinggi;

                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
© 2020 GitHub, Inc.