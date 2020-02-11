package com.example.gina.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.gina.hello.R.id.text;

public class vtabung extends AppCompatActivity {
    private EditText et_r,et_t;
    private TextView tv_hasil;
    private Button btn_voltabung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vtabung);

        et_r = (EditText) findViewById(R.id.et_r);
        et_t = (EditText) findViewById(R.id.et_t);
        tv_hasil = (TextView) findViewById(R.id.tv_hasil);
        btn_voltabung = (Button) findViewById(R.id.btn_voltabung);


        btn_voltabung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    double phi = 3.14;
                    String sJari = et_r.getText().toString();
                    String sTinggi = et_t.getText().toString();

                    double jari = Double.parseDouble(sJari);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = phi*jari*jari*tinggi;

                    String sHasil = String.valueOf(hasil);
                    tv_hasil.setText(sHasil);
                }catch  (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
