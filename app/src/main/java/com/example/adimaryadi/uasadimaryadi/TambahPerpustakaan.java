package com.example.adimaryadi.uasadimaryadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TambahPerpustakaan extends AppCompatActivity {

    private EditText kodebuku,koderak,isbn,judulbuku,penulis,penerbit,tahunpenerbit,jumlahbuku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_perpustakaan);

        final Button kembali  =  findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        kodebuku      =   (EditText) findViewById(R.id.jumlah_buku7);
        koderak       =   (EditText) findViewById(R.id.koderak);
        isbn          =   (EditText) findViewById(R.id.isbn);
        judulbuku     =   (EditText) findViewById(R.id.judulbuku);
        penulis       =   (EditText) findViewById(R.id.penulis);
        penerbit      =   (EditText) findViewById(R.id.penerbit);
        tahunpenerbit =   (EditText) findViewById(R.id.penerbit);
        jumlahbuku    =   (EditText) findViewById(R.id.jumlah_buku);

        final Button simpan  = findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  KodeBuku  =  kodebuku.getText().toString();
                String  KodeRak   =  koderak.getText().toString();
                String  ISBN      =  isbn.getText().toString();
                String  JudulBuku =  judulbuku.getText().toString();
                String  Penulis   =  penulis.getText().toString();
                String  Penerbit  =  penerbit.getText().toString();
                String  TahunPenerbit  =  tahunpenerbit.getText().toString();
                String  JumlahBuku     =  jumlahbuku.getText().toString();

                final   String[] data     =  new String[] {KodeBuku,KodeRak,ISBN,JudulBuku,Penulis,Penerbit,TahunPenerbit,JumlahBuku};
                Intent  Tampilkan_simpan  =  new Intent(TambahPerpustakaan.this,TampilkanBuku.class);
                Tampilkan_simpan.putExtra("data", data);
                startActivity(Tampilkan_simpan);
            }
        });
    }
}
