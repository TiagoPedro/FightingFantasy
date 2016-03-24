package com.example.tiagopedro.fightingfantasy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class NewAdventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_newadventure);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String[] title_array = getResources().getStringArray(R.array.titles);

        ListView title_list = (ListView) findViewById(R.id.title_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, title_array);

        title_list.setAdapter(adapter);

        title_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selected = ((TextView) view).getText().toString();

                int adventureId = findTitlePosition(title_array, selected);
                MainActivity.setCurrentAdventure(adventureId);
                goToSplashScreenActivity(adventureId);
            }
        });
    }

    private void goToSplashScreenActivity(int titleID) {

        Intent intentBundle = new Intent(this, SplashScreenActivity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("titleID", titleID);
        intentBundle.putExtras(bundle);

        startActivity(intentBundle);
    }

    private int findTitlePosition(String[] titlesArray, String title) {
        for(int i = 0; i < titlesArray.length; i++){
            if(title == titlesArray[i]){
                return i+1;
            }
        }
        return 0;
    }
}
