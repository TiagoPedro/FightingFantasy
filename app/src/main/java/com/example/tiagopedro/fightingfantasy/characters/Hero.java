package com.example.tiagopedro.fightingfantasy.characters;

import com.example.tiagopedro.fightingfantasy.attributes.Attribute;
import com.example.tiagopedro.fightingfantasy.items.Item;
import com.example.tiagopedro.fightingfantasy.paragraphs.Paragraph;

import java.util.List;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */
public class Hero implements Character {
    // Instance Attributes
    private List<Attribute> listOfAttributes;
    private int currentParagraphId;
    private List<Item> listOfItems;

    // Public methods
    public Hero() {
    }

    public Hero(List<Attribute> _listOfAttributes, int _beginningParagraphId){
        listOfAttributes = _listOfAttributes;
        currentParagraphId = _beginningParagraphId;
    }

    @Override
    public List<Attribute> getAttributeList() {
        return listOfAttributes;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public int getCurrentParagraph() {
        return currentParagraphId;
    }

}

