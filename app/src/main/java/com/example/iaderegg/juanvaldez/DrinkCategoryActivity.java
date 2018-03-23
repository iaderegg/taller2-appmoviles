package com.example.iaderegg.juanvaldez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> bebidasAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_expandable_list_item_1, Drink.drinks);
        ListView lista = (ListView)findViewById(R.id.listaBebidas);
        lista.setAdapter(bebidasAdapter);

        AdapterView.OnItemClickListener escuchaItems = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkDetailsActivity.class);
                intent.putExtra(DrinkDetailsActivity.EXTRA_DRINK, (int) l);
                startActivity(intent);
            }
        };

        ListView listaBebidas = (ListView) findViewById(R.id.listaBebidas);
        listaBebidas.setOnItemClickListener(escuchaItems);

    }
}
