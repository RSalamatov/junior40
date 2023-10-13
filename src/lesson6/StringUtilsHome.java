package lesson6;

import java.util.Scanner;

public class StringUtilsHome {

    public static int stringMethods(String text) {

        // метод принимает входящими параметрами текст и возвращает кол-во гласных букв в тексте
        // Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке
        // Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
        // В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам

        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 'а' || symbol == 'е' || symbol == 'ё' || symbol == 'и' || symbol == 'о' || symbol == 'у'
                    || symbol == 'ы' || symbol == 'э' || symbol == 'ю' || symbol == 'я') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void reverseString(String text) {
        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(reverse);
    }

    public static int punctuationMarks(String text) {

        char[] punctuation = {'.', ',', '-', ':', ';', '?', '!', ')', '('};
        char[] charArrayText = text.toCharArray();
        int count = 0;
        for (int i = 0; i < charArrayText.length; i++) {
            for (int j = 0; j < punctuation.length; j++) {
                if (charArrayText[i] == punctuation[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void printSquare(int row, int col) {

        if (row == col) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Вы ввели разные стороны, это не квадрат");
        }
    }
}