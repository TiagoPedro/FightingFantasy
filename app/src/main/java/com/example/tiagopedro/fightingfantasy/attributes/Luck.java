package com.example.tiagopedro.fightingfantasy.attributes;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */
public class Luck extends Attribute {

    public Luck(AttributeType _type, int _value) {
        super(_type, _value);
    }

    @Override
    public void increaseValue() {
        value++;
    }

}
