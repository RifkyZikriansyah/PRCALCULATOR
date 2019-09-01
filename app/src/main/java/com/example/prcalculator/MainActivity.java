package com.example.prcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.xml.xpath.XPathExpressionException;

public class MainActivity extends AppCompatActivity {




    Button mAC, m1, m2, m3, m4, m5, m6, m7, m8, m9, m0, mHasil, mTambah, mKurang, mKali, mBagi, mtitik, mKBuka, mKTutup;
    EditText edt;
    String angka = " ";

    private void initUI() {
        mKBuka = findViewById(R.id.kurungbuka);
        mKTutup = findViewById(R.id.kurungtutup);
        mAC = findViewById(R.id.ac);
        mtitik = findViewById(R.id.titik);
        m1 = findViewById(R.id.satu);
        m2 = findViewById(R.id.dua);
        m3 = findViewById(R.id.tiga);
        m4 = findViewById(R.id.empat);
        m5 = findViewById(R.id.lima);
        m6 = findViewById(R.id.enam);
        m7 = findViewById(R.id.tujuh);
        m8 = findViewById(R.id.delapan);
        m9 = findViewById(R.id.sembilan);
        m0 = findViewById(R.id.nol);
        mHasil = findViewById(R.id.samadengan);
        mTambah = findViewById(R.id.tambah);
        mKali = findViewById(R.id.kali);
        mKurang = findViewById(R.id.kurang);
        mBagi = findViewById(R.id.bagi);
        edt = findViewById(R.id.edt);
    }

    private void initBtn() {
        mKBuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " ( ";
                edt.setText(angka);
            }
        });
        mKTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " ) ";
                edt.setText(angka);
            }
        });
        mtitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += ".";
                edt.setText(angka);
            }
        });
        mAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = " ";
                edt.setText(angka);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "1";
                edt.setText(angka);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "2";
                edt.setText(angka);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "3";
                edt.setText(angka);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "4";
                edt.setText(angka);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "5";
                edt.setText(angka);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "6";
                edt.setText(angka);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "7";
                edt.setText(angka);
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "8";
                edt.setText(angka);
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "9";
                edt.setText(angka);
            }
        });
        m0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += "0";
                edt.setText(angka);
            }
        });
        mHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("#,###");
                Expression e = new Expression(angka);
                BigDecimal hasil = e.eval();
                edt.setText(df.format(hasil));
                angka = "";
            }
        });
        mKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " - ";
                edt.setText(angka);
            }
        });
        mTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " + ";
                edt.setText(angka);
            }
        });
        mBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " / ";
                edt.setText(angka);
            }
        });
        mKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka += " * ";
                edt.setText(angka);
            }
        });




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initBtn();


    }
}
