package com.dicoding.picodiploma.utspraktik_if1_10116580_hamdanhamdani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

//tgl pengerjaan 5 juni 2021
//10116580
//Hamdan Hamdani
//IF-1

public class MainActivity extends AppCompatActivity {

    EditText nik,nama, tglLahir;
    RadioGroup jenisKelamin, hubungan;
    RadioButton radioButtonJenisKelamin, radioButtonHubungan;
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nik = findViewById(R.id.editTextNik);
        nama = findViewById(R.id.editTextNama);
        tglLahir = findViewById((R.id.editTextTanggal));
        selanjutnya = findViewById(R.id.btnSelanjutnya);

        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int radioIdJenisKelamin = jenisKelamin.getCheckedRadioButtonId();
//                radioButtonJenisKelamin = findViewById(radioIdJenisKelamin);
//                int radioIdHubungan = hubungan.getCheckedRadioButtonId();
//                radioButtonHubungan = findViewById(radioIdHubungan);

                Intent i = new Intent(MainActivity.this, PreveiwData.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("nik", nik.getText().toString());
                i.putExtra("tglLahir", tglLahir.getText().toString());
//                i.putExtra("jenisKelamin", radioButtonJenisKelamin.getText().toString());
//                i.putExtra("hubungan", radioButtonHubungan.getText().toString());
                startActivity(i);
            }
        });

    }

//    public void checkButtonJenisKelamin(View v) {
//        int radioIdJenisKelamin = jenisKelamin.getCheckedRadioButtonId();
//        radioButtonJenisKelamin = findViewById(radioIdJenisKelamin);
//    }

//    public void checkButtonHubungan(View v) {
//        int radioIdHubungan = hubungan.getCheckedRadioButtonId();
//        radioButtonHubungan = findViewById(radioIdHubungan);
//    }

}