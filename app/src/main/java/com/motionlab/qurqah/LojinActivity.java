package com.motionlab.qurqah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LojinActivity extends AppCompatActivity {
    private Button lojin;
    EditText editText1, editText2; //Deklarasi object dari class EdiText
    String text1, text2; //Deklarasi object string

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lojin);

    }
    public void loginMasuk(View view) {
        //Method onClick pada Button

        editText1 = (EditText) findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
        if ((text1.contains("Admin")) && ((text2.contains("Qurqah")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LojinActivity.this, MainActivity.class);
            startActivity(intent);
        } else if ((text1.matches("") || text2.matches("")))
          /*
          Atau jika input text 1 dan text 2 kosong
           */ {
            //Maka akan menampilkan pesan text toast
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        } else {
            //jika kedua kondisi diatas tidak memenuhi

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }
        lojin = (Button) findViewById(R.id.lupa_pass);
        lojin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LojinActivity.this, BelumTersediaActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
        lojin = (Button) findViewById(R.id.buatbaru);
        lojin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LojinActivity.this, BelumTersediaActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });

    }


}

