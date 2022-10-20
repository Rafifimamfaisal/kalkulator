package com.example.kalkulator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersegiPanjang extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang, txt_lebar;
    private TextView tvluas;
    private TextView tvkeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi_panjang, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        tvluas = v.findViewById(R.id.tvluas);
        tvkeliling = v.findViewById(R.id.tvkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }

            private void hitungLuas() {
                String panjang = txt_panjang.getText().toString();
                String lebar = txt_lebar.getText().toString();

                Integer luas = Integer.parseInt(panjang) * Integer.parseInt(lebar);
                tvluas.setText("Luas =" + luas);
            }

            private void hitungKeliling() {
                String panjang = txt_panjang.getText().toString();
                String lebar = txt_lebar.getText().toString();

                Integer keliling = 2 * (Integer.parseInt(panjang) + Integer.parseInt(lebar));
                tvkeliling.setText("Keliling= " + keliling);
            }
        });
        return v;
    }
}