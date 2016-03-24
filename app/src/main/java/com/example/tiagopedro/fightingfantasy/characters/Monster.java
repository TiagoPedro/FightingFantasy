package com.example.tiagopedro.fightingfantasy.characters;

import com.example.tiagopedro.fightingfantasy.attributes.Attribute;

import java.util.List;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */
public class Monster implements Character {
    private List<Attribute> listOfAttributes;

    @Override
    public List<Attribute> getAttributeList() {
        return listOfAttributes;
    }
}
