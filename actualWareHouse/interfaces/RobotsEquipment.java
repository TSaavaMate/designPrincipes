package interfaces;

import Concreteclasses.Item;

import java.util.List;

public interface RobotsEquipment {
    void addRobot(Robot robot);
    void removeRobot(Robot Robot);
    List<Robot> getAllRobots();
}
