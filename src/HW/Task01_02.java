package HW;

import java.util.Random;

public class Task01_02 {

    public static void main(String args[]) {
        int arrL = 22;
        int[] arr = new int[arrL];
        arr=getArray(arrL);
        printArray(arr);

    }
    public static int[] getArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            arr[i] = random.nextInt(33);
            System.out.println(arr[i]);
        }
        for (int i = 2; i < arrayLength; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
