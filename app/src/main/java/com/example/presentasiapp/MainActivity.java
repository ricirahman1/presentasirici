package com.example.presentasiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button btn;
    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.nilai);
        btn = (Button) findViewById(R.id.button);
        tampil=(TextView)findViewById(R.id.text); 

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                int nilai = Integer.parseInt(ed1.getText().toString());

                if (nilai >= 90){
                    tampil.setText(nilai + " = Grade A");
                }else if (nilai >= 80){
                    tampil.setText(nilai + " = Grade B");
                }else if (nilai >= 60){
                    tampil.setText(nilai + " = Grade C");
                }else if (nilai >= 30){
                    tampil.setText(nilai + " = Grade D");
                }else{
                    tampil.setText(nilai + " = Gagal");
                }
            }
        });
    }
}