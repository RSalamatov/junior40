package lesson6;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        int[][] field = {{2, 4, 435, 786}, {78, 45, 26, 49}, {79, 80, 42, 12}};
        int evenCount = HomeWorkUtils.evenNumbers(field);
        System.out.println("Количество четныйх чисел в массиве: " + evenCount);


        int num1 = 48;
        int num2 = 28;
        int num3 = 456;
        int num4 = 123;
        int num5 = 64;
        HomeWorkUtils.minNumbers(num1, num2, num3, num4, num5);

        int length = 10;
        int[] fieldRandom = HomeWorkUtils.arrayRandom(length);

        int monthNumber = 3;
        String returnM = HomeWorkUtils.returnMonth(monthNumber);
        System.out.println(returnM);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        int inputA = scanner.nextInt();
        System.out.println("Введите сторону B: ");
        int inputB = scanner.nextInt();
        System.out.println("Введите сторону C: ");
        int inputC = scanner.nextInt();
        int max = HomeWorkUtils.triangle(inputA, inputB, inputC);
    }
}