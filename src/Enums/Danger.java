package Enums;

public class Danger {

    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
    }

    enum DangerLevel {
        HIGH (3),
        MEDIUM (2),
        LOW (1);

        final int level;

        DangerLevel(int level) {
            this.level = level;
        }

        int getLevel() {
            return this.level;
        }
    }
}
