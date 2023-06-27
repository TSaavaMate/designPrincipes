package interfaces;

import Concreteclasses.Item;
import Concreteclasses.Location;

public interface Robot {
    void moveTo(Location location);
    void pickItem(Item item);
    void dropItem(Item item,Location location);
}
