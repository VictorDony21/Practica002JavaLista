package com.example.practica002javalista;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ItemData> list = new ArrayList<>();
        list.add(new ItemData(getString(R.string.itemFrappses), getString(R.string.msgFrapsses), R.drawable.categorias));
        list.add(new ItemData(getString(R.string.itemAgradecimiento), getString(R.string.msgAgradecimiento), R.drawable.agradecimiento));
        list.add(new ItemData(getString(R.string.itemAmor), getString(R.string.msgAmor), R.drawable.corazon));
        list.add(new ItemData(getString(R.string.itemNewyear), getString(R.string.msgNewYear), R.drawable.nuevo));
        list.add(new ItemData(getString(R.string.itemCanciones), getString(R.string.msgCanciones), R.drawable.canciones));

        listView = findViewById(R.id.listView1);
        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.listview_layout, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), getString(R.string.msgSeleccionado).toString() + " " +
                        ((ItemData) adapterView.getItemAtPosition(i)).getTextCategoria(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}