package com.example.tiagopedro.fightingfantasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.ImageView;
import android.os.Handler;


public class SplashScreenActivity extends AppCompatActivity {

    static final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        Intent intentExtras = getIntent();
        Bundle extrasBundle = intentExtras.getExtras();
        int adventureID = 0;
        if(!extrasBundle.isEmpty()){
            if(extrasBundle.containsKey("titleID")){
                adventureID = extrasBundle.getInt("titleID");
            }
        }

        ImageView splash_screen = (ImageView) findViewById(R.id.title_splashscreen);

        int resId = getResources().getIdentifier("ff" + adventureID, "drawable", getPackageName());
        splash_screen.setImageResource(resId);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreenActivity.this, CreateHeroActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
