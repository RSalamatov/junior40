package lesson6;

import java.util.Random;

public class HomeWorkUtils {

    public static int evenNumbers(int[][] array) {

        int countNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    countNumbers++;
                }
            }
        }
        return countNumbers;
    }

    public static void minNumbers(int number1, int number2, int number3, int number4, int number5) {
        int minNumbers = number1;
        if (number2 < minNumbers) {
            minNumbers = number2;
        }
        if (number3 < minNumbers) {
            minNumbers = number3;
        }
        if (number4 < minNumbers) {
            minNumbers = number4;
        }
        if (number5 < minNumbers) {
            minNumbers = number5;
        }
        System.out.println("Наименьше из пяти чисел: " + minNumbers);
    }

    public static int[] arrayRandom(int length) {

        int[] randomArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt();
            System.out.println(randomArray[i]);
        }
        return randomArray;
    }

    public static String returnMonth(int monthNumber) {
        String[] month = {"ЯНВАРЬ", "ФЕВРАЛЬ", "МАРТ", "АПРЕЛЬ", "МАЙ", "ИЮНЬ", "ИЮЛЬ", "АВГУСТ", "СЕНТЯБРЬ", "ОКТЯБРЬ", "НОЯБРЬ", "ДЕКАБРЬ"};

        if (monthNumber >= 1 && monthNumber <= 12) {
            return month[monthNumber - 1];
        } else {
            System.out.println("Неверный ввод");
        }
        return null;
    }

    public static int triangle(int inputA, int inputB, int inputC) {


        if (inputA > inputB && inputA > inputC) {
            if (inputB + inputC > inputA) {
                System.out.println("Это реальный треугольник");
            } else {
                if (inputA <= 0 || inputB + inputC <= inputA) {
                    System.out.println("Это нереальный треугольник");
                }
            }
        }
        if (inputB > inputA && inputB > inputC) {
            if (inputA + inputC > inputB) {
                System.out.println("Это реальный треугольник");
            } else {
                if (inputA <= 0 || inputA + inputC <= inputB) {
                    System.out.println("Это нереальный треугольник");
                }
            }
        }
        if (inputC > inputA && inputC > inputB) {
            if (inputA + inputB > inputC) {
                System.out.println("Это реальный треугольник");
            } else {
                if (inputA <= 0 || inputA + inputB <= inputC) {
                    System.out.println("Это нереальный треугольник");
                }
            }
        }
        return inputA;
    }
}