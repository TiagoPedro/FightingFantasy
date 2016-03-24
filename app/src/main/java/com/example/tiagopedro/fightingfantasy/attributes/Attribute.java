package com.example.tiagopedro.fightingfantasy.attributes;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */

abstract public class Attribute {
    protected final AttributeType type;
    protected int value;

    public Attribute(AttributeType _type, int _value){
        type = _type;
        value = _value;
    }
    /**
     * Returns the type of the attribute.
     * @return The type of the attribute (e.g Skill, Stamina, ...).
     */
    public AttributeType getType(){
        return type;
    }

    /**
     * Returns the value of this attribute.
     * @return An int holding the value of the attribute.
     */
    public int getValue(){
        return value;
    }

    public void setValue(int _value){
        value = _value;
    }

    abstract public void increaseValue();

    public void decreaseValue(){
        if(value > 0)
            value--;
    }

}

