package com.example.tiagopedro.fightingfantasy.characters;

/**
 * Created by Tiago Pedro on 13/03/2016.
 */
public class CharacterFactory {

    public CharacterFactory(){

    }

    public Character createCharacter(CharacterType _characterType){
        switch(_characterType) {
            case HERO:
                return new Hero();
            case SHIP:
                return new Ship();
            case ROBOT:
                return new Robot();
            case MONSTER:
                return new Monster();
            default:
                return null;
        }
    }
}
