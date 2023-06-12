package com.example.practica002javalista;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ItemData> {
    Activity context;
    ArrayList<ItemData> list;
    LayoutInflater inflater;

    public ListViewAdapter(Activity context, int layoutResourceId, ArrayList<ItemData> list) {
        super(context, layoutResourceId, list);
        this.context = context;
        this.list = list;
        inflater = context.getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.listview_layout, parent, false);

        ImageView imagen = itemView.findViewById(R.id.imgCategoria);
        imagen.setImageResource(list.get(position).getImageId());

        TextView textCategoria = itemView.findViewById(R.id.lblCategorias);
        textCategoria.setText(list.get(position).getTextCategoria());

        TextView textDescripcion = itemView.findViewById(R.id.lblDescripcion);
        textDescripcion.setText(list.get(position).getTextDescripcion());

        return itemView;
    }
}

