package coffeAbstractClasses;

import coffeInterfaces.Fillable;
import coffeInterfaces.PowerSwitch;

public abstract class CoffeMachine implements PowerSwitch, Fillable {

//  + fill(level: int): void
//  + makeCoffee(): void
//  + cleanMachine(): void
    private String name;
    private int waterLevel;
    private int milkLevel;
    private int sugarLevel;

    public CoffeMachine(String name, int waterLevel, int milkLevel, int sugarLevel, int coffeBeansLevel) {
        this.name = name;
    }

    private int coffeBeansLevel;

    public CoffeMachine(String name) {
        this.name = name;
    }
    public void fill(int level){}
    public void makeCoffe(){}
    public void cleanMachine(){}

    public int getMilkLevel() {
        return milkLevel;
    }

    public String getName() {
        return name;
    }
    public int getSugarLevel() {
        return sugarLevel;
    }
    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void setMilkLevel(int milkLevel) {
        this.milkLevel = milkLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public void setCoffeBeansLevel(int coffeBeansLevel) {
        this.coffeBeansLevel = coffeBeansLevel;
    }

}
