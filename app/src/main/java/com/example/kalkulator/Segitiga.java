package com.example.kalkulator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Segitiga extends Fragment {
    private EditText txt_alas,txt_tinggi;
    private Button btnHasil;
    private TextView tvluas;
    private TextView tvkeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btnHasil = v.findViewById(R.id.btnHasil);
        tvluas = v.findViewById(R.id.tvluas);
        tvkeliling = v.findViewById(R.id.tvkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if(nilai1.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_alas.requestFocus();
                }
                else if(nilai2.isEmpty()){
                    txt_tinggi.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                }
                else{
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double l = alas * tinggi * 0.5;
                    Double c = Math.sqrt(Math.pow(0.5*alas,2)+Math.pow(tinggi,2));
                    Double k = alas+(2 * c);
                    tvluas.setText(String.valueOf(l));
                    tvkeliling.setText(String.valueOf(k));
                }
            }
        });
        return v;
    }
}