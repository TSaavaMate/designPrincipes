package coffeTypes;

import coffeAbstractClasses.Beverage;
import decorator.CondimentDecorator;

public class AnyOtherCoffeType extends CondimentDecorator {
    private final Beverage beverage;

    public AnyOtherCoffeType(Beverage beverage) {
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
