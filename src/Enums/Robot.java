package Enums;

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int stepsInX = robot.getX() - toX;
        int stepsInY = robot.getY() - toY;

        System.out.println("StepsInX = " + stepsInX + " | stepsInY  = " + stepsInY);
        handleX(robot, stepsInX);
        handleY(robot, stepsInY);
    }

    static void handleX(Robot robot, int stepsInX) {
        if (stepsInX < 0) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    System.out.println("robot.turnRight();");
                    break;
                case RIGHT:
                    System.out.println("Don't move");
                    break;
                case DOWN:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft();");
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    System.out.println("robot.turnLeft(); x2");
                    break;
                default:
                    System.out.println("Not a valid direction");
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft();");
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    System.out.println("robot.turnLeft(); x2");
                    break;
                case DOWN:
                    robot.turnRight();
                    System.out.println("robot.turnRight();");
                    break;
                case LEFT:
                    System.out.println("Don't move");
                    break;
                default:
                    System.out.println("Not a valid direction");
                    break;
            }
        }

        for (int i = 0; i < Math.abs(stepsInX); i++) {
            robot.stepForward();
            System.out.println("robot.stepForward(); in x");
        }

        robot.printCurrentLocation();
    }

    static void handleY(Robot robot, int stepsInY) {
        if (stepsInY < 0) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft();");
                    break;
                case LEFT:
                    robot.turnRight();
                    System.out.println("robot.turnRight();");
                    break;
                default:
                    System.out.println("X was not handle correctly");
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    System.out.println("robot.turnRight();");
                    break;
                case LEFT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft();");
                    break;
                default:
                    System.out.println("X was not handle correctly");
                    break;
            }
        }

        for (int i = 0; i < Math.abs(stepsInY); i++) {
            robot.stepForward();
            System.out.println("robot.stepForward(); in y");
        }
    }
}

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void printCurrentLocation() {
        System.out.println("X = " + getX() + " | Y = " + getY() + " | Direction = " + getDirection());
    }
}

enum Direction {
    UP (0, 1),
    DOWN (0, -1),
    LEFT (-1, 0),
    RIGHT (1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case RIGHT:
                return DOWN;
            case LEFT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

}
