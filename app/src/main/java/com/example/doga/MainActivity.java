package com.example.doga;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView igh1,igh2,igh3,ijh1,ijh2,ijh3,iiv_rock1,iiv_rock2;
    private TextView tgep_id,tjat_id,tte1,gep,teredmeny;
    private Button bko,bpapir,bollo;
    private int[]images;
    private int a;
    private  int pgep;
    private  int pjat;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        bpapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PKepcserer();
                ELlenfel();
            }
        });

        bko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KKepcserer();
                ELlenfel();
            }
        });

        bollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SKepcserer();
                ELlenfel();
            }
        });




    }

    public  void ELlenfel(){
        images= new int[]{R.drawable.paper,R.drawable.rock,R.drawable.scissors};
        Random r= new Random();
        int rNum=r.nextInt(images.length);
        iiv_rock2.setImageResource(images[rNum]);

    }

    public void PKepcserer(){
        iiv_rock1.setImageResource(R.drawable.paper);
        a=0;
    }

    public void KKepcserer(){
        iiv_rock1.setImageResource(R.drawable.rock);
        a=1;
    }

    public void SKepcserer(){
        iiv_rock1.setImageResource(R.drawable.scissors);
        a=2;
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
        iiv_rock1=findViewById(R.id.iv_rock1);
        iiv_rock2=findViewById(R.id.iv_rock2);
        gep=findViewById(R.id.gep_va);
        teredmeny=findViewById(R.id.eredmeny);
        bko=findViewById(R.id.ko);
        bpapir=findViewById(R.id.papir);
        bollo=findViewById(R.id.ollo);


    }
}