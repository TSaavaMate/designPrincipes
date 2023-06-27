package coffeAbstractClasses;

public abstract class Beverage {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public  double cost(){return 0D;}
}
