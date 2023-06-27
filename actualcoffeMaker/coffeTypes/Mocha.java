package coffeTypes;

import coffeAbstractClasses.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return super.cost();
    }

    public Beverage getBeverage() {
        return beverage;
    }


}
