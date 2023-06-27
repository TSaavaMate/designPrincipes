package interfaces;

import Concreteclasses.Item;

import java.util.List;

public interface Warehouse {
    void addItem(Item item);
    void removeItem(Item item);
    void getItem(String id);
    List<Item> getAllItems();
}
