package com.example.gina.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class vkubus extends AppCompatActivity {
    private EditText et_s;
    private TextView tv_hasilkub;
    private Button btn_volkubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vkubus);

        et_s = (EditText) findViewById(R.id.et_s);
        tv_hasilkub = (TextView) findViewById(R.id.tv_hasilkub);
        btn_volkubus = (Button) findViewById(R.id.btn_volkubus);

        btn_volkubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sSisi = et_s.getText().toString();

                    double sisi = Double.parseDouble(sSisi);

                    double hasil = sisi * sisi * sisi;

                    String sHasil = String.valueOf(hasil);
                    tv_hasilkub.setText(sHasil);
                }
                catch  (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
