package com.example.doga;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
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

    public  void ELlenfel() {
        images = new int[]{R.drawable.paper, R.drawable.rock, R.drawable.scissors};
        Random r = new Random();
        int rNum = r.nextInt(images.length);
        iiv_rock2.setImageResource(images[rNum]);


        if (a == rNum) {
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Mind ketten agyun azt mutatatátok..";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();



        } else if ((a == 1) && (rNum == 0)) {
            pgep++;
            switch (pgep) {
                case 3:
                    ijh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    ijh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    ijh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Gép kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();
        } else if (a == 0 && rNum == 2) {

            pgep++;
            switch (pgep) {
                case 3:
                    ijh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    ijh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    ijh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Gép kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();
        } else if (a == 2 && rNum == 1) {

            pgep++;
            switch (pgep) {
                case 3:
                    ijh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    ijh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    ijh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Gép kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();
        } else if (a == 0 && rNum == 1) {
            pjat++;
            switch (pjat) {
                case 3:
                    igh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    igh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    igh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Te kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();

        } else if (a == 1 && rNum == 2) {
            pjat++;
            switch (pjat) {
                case 3:
                    igh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    igh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    igh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);

            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Te kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();
        } else if (a == 2 && rNum == 0) {
            pjat++;
            switch (pjat) {
                case 3:
                    igh3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    igh2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    igh1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);

            Context ige = getApplication();
            teredmeny.setText("Eredmeny: Ember:" + pjat + " Computer:" + pgep);
            CharSequence text = "Te kapot pontot.";
            int hosz = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(ige, text, hosz);
            toast.show();
        }

        if(pjat==3 || pgep == 3)
        {

            if (pjat==3)
            {

                AlertDialog.Builder alert= new AlertDialog.Builder(this);
                alert.setTitle("Te nyertél");
                alert.setMessage("Szeretnél ujra játszani?");
                alert.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Sok sikert a játszmához.",Toast.LENGTH_LONG).show();
                        Alapvisza();

                    }
                });
                alert.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Várunk visza.",Toast.LENGTH_LONG).show();
                        finish();

                    }
                });
                 alert.show();

            }
            else{

                AlertDialog.Builder alert1= new AlertDialog.Builder(this);
                alert1.setTitle("Gép nyertél");
                alert1.setMessage("Szeretnél ujra játszani?");
                alert1.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText( getApplicationContext(),"Sok sikert a játszmához.",Toast.LENGTH_LONG).show();
                        Alapvisza();

                    }
                });

                alert1.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Várunk visza.",Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                alert1.show();
            }
        }

    }

    public void Alapvisza()
    {
        pgep=0;
        pjat=0;

        igh1.setImageResource(R.drawable.heart2);
        igh2.setImageResource(R.drawable.heart2);
        igh3.setImageResource(R.drawable.heart2);
        ijh1.setImageResource(R.drawable.heart2);
        ijh2.setImageResource(R.drawable.heart2);
        ijh3.setImageResource(R.drawable.heart2);
        teredmeny.setText("Eredmeny: Ember:"+pjat+" Computer:"+pgep);
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