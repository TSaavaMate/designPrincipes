package Concreteclasses;

import interfaces.Robot;
import interfaces.RobotsEquipment;
import interfaces.Warehouse;

import java.util.List;

public class AutomatedWarehouse implements Warehouse, RobotsEquipment {
    List<Robot> robots;
    List<Item> items;
    @Override
    public void addItem(Item item) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void getItem(String id) {

    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public void addRobot(Robot robot) {

    }

    @Override
    public void removeRobot(Robot Robot) {

    }

    @Override
    public List<Robot> getAllRobots() {
        return null;
    }
}
