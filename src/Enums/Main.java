package Enums;

public class Main {
    public static void main(String[] args) {
        Robot walle = new Robot(0, 0, Direction.UP);
        walle.printCurrentLocation();
        Move.moveRobot(walle, -1, 1);
        walle.printCurrentLocation();

    }

}
