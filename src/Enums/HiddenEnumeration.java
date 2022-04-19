package Enums;

public class HiddenEnumeration {
    public static void main(String[] args) {
        int count = 0;
        for (Secret i : Secret.values()) {
            if (i.name().contains("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }

    enum Secret {
        STAR, CRASH, START, STARTING
    }
}
