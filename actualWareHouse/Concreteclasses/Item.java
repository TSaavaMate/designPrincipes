package Concreteclasses;

public class Item {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Item(String id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    private double weight;
}
