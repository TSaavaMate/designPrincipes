import coffeAbstractClasses.Beverage;

public class ConcreteCoffe extends Beverage {
    private Coffes type;



    public ConcreteCoffe(Coffes type) {
        this.type = type;
    }

    public Coffes getType() {
        return type;
    }
}
