package com.example.adimaryadi.uasadimaryadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final Intent dashboard    =   getIntent();
        String email        =   dashboard.getStringExtra(MainActivity.DATA);
        TextView textemail  =   findViewById(R.id.email);
        textemail.setText(email);

        final Button daftar =  findViewById(R.id.input);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tambah  =  new Intent(dashboard.this, TambahPerpustakaan.class);
                startActivity(tambah);
            }
        });
    }
}
