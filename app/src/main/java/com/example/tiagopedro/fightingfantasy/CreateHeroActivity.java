package com.example.tiagopedro.fightingfantasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.tiagopedro.fightingfantasy.attributes.Attribute;
import com.example.tiagopedro.fightingfantasy.characters.CharacterFactory;
import com.example.tiagopedro.fightingfantasy.characters.Hero;
import com.example.tiagopedro.fightingfantasy.items.Item;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CreateHeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_create_hero);

        // !TODO! parse of settings xml to determine which kind of hero
        CharacterFactory cf = new CharacterFactory();
        try {
            setupHero();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        ImageButton skillButton = (ImageButton) findViewById(R.id.skill_button);
        ImageButton staminaButton = (ImageButton) findViewById(R.id.stamina_button);
        ImageButton luckButton = (ImageButton) findViewById(R.id.luck_button);
    }

    private void setupHero(Hero hero) throws XmlPullParserException {
        XmlPullParserFactory factory;
        factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();

        ArrayList<Attribute> attributeList = new ArrayList();
        ArrayList<Item> itemList = new ArrayList();
        int beginningParagraphId;


    }

    private void setupShip(){

    }

    private void setupRobot(){

    }
}
