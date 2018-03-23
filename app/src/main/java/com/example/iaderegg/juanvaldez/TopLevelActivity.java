package com.example.iaderegg.juanvaldez;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;



import java.util.List;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener escuchaListView = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listaBebidas = (ListView)findViewById(R.id.listView);
        listaBebidas.setOnItemClickListener(escuchaListView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);



        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.action_settings:
                Intent intent_make_order = new Intent(TopLevelActivity.this, MakeOrderActivity.class);
                startActivity(intent_make_order );
                break;

            case R.id.actions_share:

                Intent intent_action_share = new Intent(android.content.Intent.ACTION_SEND);
                intent_action_share.setType("text/plain");
                startActivity(Intent.createChooser(intent_action_share, "Compartir vía"));

                break;
        }

        return super.onOptionsItemSelected(item);
    }



}
