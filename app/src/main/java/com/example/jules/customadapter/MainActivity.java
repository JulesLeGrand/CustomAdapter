package com.example.jules.customadapter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private AdaptadorLista adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Persona> model = new ArrayList<Persona>();
        Persona p1 = new Persona("René", "López", "Gato Volador");
        model.add(p1);

        {
            p1 = new Persona("Jesús", "López", "Robocop");
            model.add(p1);

            p1 = new Persona("Javier", "Díaz", "Ronco");
            model.add(p1);

            p1 = new Persona("Jesús", "Varela", "Popochas");
            model.add(p1);

            p1 = new Persona("Daniel", "Varela", "Cuyo");
            model.add(p1);

            p1 = new Persona("Alberto", "Valverde", "Tiburón");
            model.add(p1);

            p1 = new Persona("Gilberto", "Ruvalcaba", "Triki");
            model.add(p1);

            p1 = new Persona("Armando", "Quiroga", "Armand");
            model.add(p1);

            p1 = new Persona("Manuel", "Guillén", "Mago Frank");
            model.add(p1);
        }

        adapter = new AdaptadorLista(this, model);

        lista = (ListView) findViewById(R.id.milista);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try {
                    Persona mPersona = (Persona) adapter.getItem(i);
                    Log.e("Persona", mPersona.getNombre() + "--" + mPersona.getApodo());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
