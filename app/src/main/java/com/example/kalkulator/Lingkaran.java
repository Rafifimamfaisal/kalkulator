package com.example.kalkulator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Lingkaran extends Fragment {
        private Button btnHasil;
        private EditText txt_jari_jari;
        private TextView tvluas;
        private TextView tvkeliling;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);

            btnHasil = v.findViewById(R.id.btnHasil);
            txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
            tvluas = v.findViewById(R.id.tvluas);
            tvkeliling = v.findViewById(R.id.tvkeliling);

            btnHasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hitungLuas();
                    hitungKeliling();
                }

            private void hitungLuas() {
                String jari = txt_jari_jari.getText().toString();

                Double luas = 3.14 * Double.parseDouble(jari) * Double.parseDouble(jari);
                tvluas.setText("Luas =" + luas);
            }

            private void hitungKeliling() {
                String jari = txt_jari_jari.getText().toString();

                Double keliling = 2 * 3.14 * Double.parseDouble(jari);
                tvkeliling.setText("Keliling= " + keliling);
            }
        });

            return v;
        }




}


