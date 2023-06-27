package coffeTypes;

import coffeAbstractClasses.Beverage;
import decorator.CondimentDecorator;

public class MIlk extends CondimentDecorator {
    private final Beverage beverage;

    public MIlk(Beverage beverage) {
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
