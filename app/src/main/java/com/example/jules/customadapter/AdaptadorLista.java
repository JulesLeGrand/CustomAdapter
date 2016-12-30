package com.example.jules.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Julio C. Godínez García on 22/12/2016.
 */

public class AdaptadorLista extends BaseAdapter{

    private Context context;
    private ArrayList<Persona> arrayList;

    public AdaptadorLista(Context context, ArrayList<Persona> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_personas,null);
        }

        TextView nombre = (TextView)view.findViewById(R.id.nombre);
        TextView apellido =  (TextView)view.findViewById(R.id.apellido);
        TextView apodo = (TextView)view.findViewById(R.id.apodo);

        nombre.setText(arrayList.get(i).getNombre());
        apellido.setText(arrayList.get(i).getApellido());
        apodo.setText(arrayList.get(i).getApodo());

        return view;
    }
}
