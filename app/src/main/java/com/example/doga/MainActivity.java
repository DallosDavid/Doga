package com.example.doga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView igh1,igh2,igh3,ijh1,ijh2,ijh3,iiv_rock1,iiv_rock2;
    private TextView tgep_id,tjat_id,tte1,gep,teredmeny;
    private Button bko,bpapir,bollo;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init() {
        igh1=findViewById(R.id.gh1);
        igh2=findViewById(R.id.gh2);
        igh3=findViewById(R.id.gh3);
        ijh1=findViewById(R.id.jh1);
        ijh2=findViewById(R.id.jh2);
        ijh3=findViewById(R.id.jh3);
        tgep_id=findViewById(R.id.gep_id);
        tjat_id=findViewById(R.id.jat_id);
        tte1=findViewById(R.id.te1);
        gep=findViewById(R.id.gep_va);
        teredmeny=findViewById(R.id.eredmeny);
        bko=findViewById(R.id.ko);
        bpapir=findViewById(R.id.papir);
        bollo=findViewById(R.id.ollo);


    }
}