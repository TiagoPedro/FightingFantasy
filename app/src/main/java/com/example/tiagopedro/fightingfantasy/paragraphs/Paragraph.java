package com.example.tiagopedro.fightingfantasy.paragraphs;

import com.example.tiagopedro.fightingfantasy.items.Item;

import java.util.List;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */
public class Paragraph {
    // Private attributes
    private final int ID;
    private List<Character> presentCharacters;
    private List<Item> presentItems;

    public Paragraph(int _ID, List<Character> _presentCharacters, List<Item> _presentItems){
        ID = _ID;
        presentCharacters = _presentCharacters;
        presentItems = _presentItems;
    }

    public int getID(){
        return ID;
    }

    public List<Character> getPresentCharacters(){
        return presentCharacters;
    }

    public List<Item> getItems(){
        return presentItems;
    }

    public void addCharacter(Character character){
        presentCharacters.add(character);
    }

    public void removeCharacter(Character character){
        presentCharacters.remove(character);
    }


}