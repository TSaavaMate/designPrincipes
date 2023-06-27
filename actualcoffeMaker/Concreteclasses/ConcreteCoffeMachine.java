package Concreteclasses;

import coffeAbstractClasses.CoffeMachine;

public class ConcreteCoffeMachine extends CoffeMachine {


    public ConcreteCoffeMachine(String name) {
        super(name);
    }

    @Override
    public int getLevel() {return 0;}

    @Override
    public boolean isOn() {return false;}

    @Override
    public void turnOn() {}

    @Override
    public void turnOff() {}
    public void makeCoffe(){}
}
