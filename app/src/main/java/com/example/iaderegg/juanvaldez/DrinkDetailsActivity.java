package com.example.iaderegg.juanvaldez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK = "bebida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_details);

        int id = (int) getIntent().getExtras().get(EXTRA_DRINK);
        Drink bebida = Drink.drinks[id];

        TextView name = findViewById(R.id.name);
        name.setText(bebida.getName());

        ImageView imagen = findViewById(R.id.imageBebida);
        imagen.setImageResource(bebida.getImageId());

        TextView description = findViewById(R.id.description);
        description.setText(bebida.getDescription());
    }
}
