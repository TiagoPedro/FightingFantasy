package com.example.tiagopedro.fightingfantasy.attributes;

/**
 * Created by Tiago Pedro on 06/03/2016.
 */
abstract public class FixedAttribute extends Attribute {
    protected int maximumValue;

    public FixedAttribute(AttributeType _type, int _value, int _maximumValue) {
        super(_type, _value);
        maximumValue = _maximumValue;
    }

    // setters and getters
    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int _maximumValue){
        maximumValue = _maximumValue;
    }



    @Override
    public void increaseValue() {
        if(value < maximumValue)
            value++;
    }

    public void increaseMaximumValue(){
        maximumValue++;
    }

    public void decreaseMaximumValue(){
        if(maximumValue > 0)
            maximumValue--;
    }
}