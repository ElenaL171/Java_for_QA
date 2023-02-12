package HW;

import java.util.Scanner;

public class Task01_02 {
    public static void main(String args[]) {
        //Создайте массив на 22 элемента
        int[] array = inputArray(22);
        //Посчитайте сумму элементов массива от 0 до 21
        int sum = 0;
        for (int i = 0; i <= 21; i++) {
            sum = sum + array[i];
        }
        printArray(array);
        System.out.println(sum);
        //Посчитайте сумму элементов массива от 21 до 0
        int sum1 = 0;
        for (int i = 21; i >= 0; i--) {
            sum1 = sum1 + array[i];
        }
        System.out.println(sum1);
        //Посчитайте сумму всех элементов массива от 21 до 0 с четными индексами
        int sum2 = 0;
        for (int i = 21; i >= 0; i--) {
            if (i % 2 == 0)
                sum2 = sum2 + array[i];
        }
        System.out.println(sum2);
        //Посчитайте сумму всех элементов массива от 21 до 0 с нечетными индексами
        int sum3 = 0;
        for (int i = 21; i >= 0; i--) {
            if (i % 2 != 0)
                sum3 = sum3 + array[i];
        }
        System.out.println(sum3);
        //Посчитайте сумму всех элементов массива от 21 до 0 попарно
        int sum4 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum4 = sum4 + array[i] + array[array.length - 1 - i];
        }
        System.out.println(sum4);
    }

    public static int[] inputArray(int j) {
        int i;
        int[] array = new int[j];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < j; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            int num1 = sc.nextInt();
            array[i] = num1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
