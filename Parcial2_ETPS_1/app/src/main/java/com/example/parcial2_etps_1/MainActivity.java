package com.example.parcial2_etps_1;
//Cruz Chávez 25-4831-2018

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas ("Alexander Pierrot","CEO","Insures S.O"));
        listapersonas.add(new Personas ("Carlos Lopez","Asistente","Hospital blue"));
        listapersonas.add(new Personas ("Sara Bonz","Directora de marketing","Electrical parts ltd"));
        listapersonas.add(new Personas ("Liliana Clarence","Diseñadora de productos","Creativa app"));
        listapersonas.add(new Personas ("Benito Peralta","Supervisor de ventas","Neumáticos Press"));
        listapersonas.add(new Personas ("Juan Jaramillo","CEO","Banco Nacional"));
        listapersonas.add(new Personas ("Christian Steps","CTO","Cooperativa Verde"));
        listapersonas.add(new Personas ("Alexa Giraldo","Lead Programmer","Frutisofy"));
        listapersonas.add(new Personas ("Linda Murillo","Directora de marketing","Seguros Boliver"));
        listapersonas.add(new Personas ("Lizeth Astrada","CEO","Concesionario Motolox"));

        AdaptadorPersonas adaptador = new AdaptadorPersonas (this);
        lv1=findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);

    }
    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.personas, listapersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.personas, null);

            TextView textView1 = item.findViewById(R.id.tvNombre);
            TextView textView2 = item.findViewById(R.id.tvCargo);
            TextView textView3 = item.findViewById(R.id.tvCompania);

            textView1.setText(listapersonas.get(position).getNombre());
            textView2.setText(listapersonas.get(position).getCargo());
            textView3.setText(listapersonas.get(position).getCompania());

            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return (item);
        }

    }
}