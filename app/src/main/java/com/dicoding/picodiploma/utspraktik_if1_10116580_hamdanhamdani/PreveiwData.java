package com.dicoding.picodiploma.utspraktik_if1_10116580_hamdanhamdani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
//tgl pengerjaan 5 juni 2021
//10116580
//Hamdan Hamdani
//IF-1
public class PreveiwData extends AppCompatActivity {
    
    EditText eNik, eNama, eJKelamin, eHubungan, eTglLahir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preveiw_data);

        String nama = getIntent().getExtras().getString("nama");
        String nik = getIntent().getExtras().getString("nik");
        String tglLahir = getIntent().getExtras().getString("tglLahir");
//        String jKelamin = getIntent().getExtras().getString("jenisKelamin");
//        String hubungan = getIntent().getExtras().getString("hubungan");

        eNik = findViewById(R.id.editTextNik);
        eNama = findViewById(R.id.editTextNama);
        eJKelamin = findViewById(R.id.editTextJenisKelamin);
        eTglLahir = findViewById(R.id.editTextTanggal);
        eHubungan = findViewById(R.id.editTextHubungan);
        eNik.setHint(nik);
        eNama.setHint(nama);
//        eJKelamin.setHint(jKelamin);
//        eHubungan.setHint(hubungan);
        eTglLahir.setHint(tglLahir);
    }
}