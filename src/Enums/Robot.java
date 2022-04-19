package Enums;

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction desiredDirectionX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;

        while (robot.getDirection() != desiredDirectionX) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction desiredDirectionY = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != desiredDirectionY) {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
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
