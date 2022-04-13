package Tests;

public class Tests {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        traverseArray(arr);
        System.out.println();
        addOneToArray(arr);
        traverseArray(arr);



    }

    public static void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void addOneToArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }


}
