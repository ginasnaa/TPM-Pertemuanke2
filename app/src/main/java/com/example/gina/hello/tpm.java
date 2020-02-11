package com.example.gina.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tpm extends AppCompatActivity {

    private Button btn_tabung;
    private Button btn_kubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpm);
        btn_tabung = (Button) findViewById(R.id.btn_tabung);
        btn_kubus = (Button) findViewById(R.id.btn_kubus);

        btn_tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(),vtabung.class);
                startActivity(intent);
            }
        });

        btn_kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(),vkubus.class);
                startActivity(intent);
            }
        });
    }
}
