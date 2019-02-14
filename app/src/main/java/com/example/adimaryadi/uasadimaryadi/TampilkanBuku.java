package com.example.adimaryadi.uasadimaryadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TampilkanBuku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan_buku);

        Intent tampil      =   getIntent();
        String[] dataform  =   tampil.getStringArrayExtra("data");
        int[] data         =   {R.id.kodebuku0,R.id.koderak1,R.id.isbn2,R.id.judulbuku3,R.id.penulis4,R.id.penerbit5,R.id.tahunpenerbit6,R.id.jumlah_buku7};

        for (int i = 0; i < dataform.length; i++) {
            TextView tampilkan   =   (TextView) findViewById(data[i]);
            tampilkan.setText(dataform[i]);
        }
    }
}
