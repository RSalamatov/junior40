package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("Выберите уровень: ");
        System.out.println("Новичок: ");
        System.out.println("Любитель: ");
        System.out.println("Профессионал: ");
        System.out.println("Особый: ");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {
                // нужно поставить рандомно одну мину

                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 7;
                }
            }

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        }

        if (level.equalsIgnoreCase("любитель")) {
            int[][] fieldAmateur = new int[16][16];
            for (int i = 0; i < 40; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);

                if (fieldAmateur[row][col] != 0) {
                    i--;
                } else {
                    fieldAmateur[row][col] = 7;
                }
            }

            for (int i = 0; i < fieldAmateur.length; i++) {
                for (int j = 0; j < fieldAmateur[i].length; j++) {
                    System.out.print(fieldAmateur[i][j] + " ");
                }
                System.out.println();
            }
        }

        if (level.equalsIgnoreCase("профессионал")) {
            int[][] fieldProfessional = new int[16][30];
            for (int i = 0; i < 99; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 30);

                if (fieldProfessional[row][col] != 0) {
                    i--;
                } else {
                    fieldProfessional[row][col] = 7;
                }
            }

            for (int i = 0; i < fieldProfessional.length; i++) {
                for (int j = 0; j < fieldProfessional[i].length; j++) {
                    System.out.print(fieldProfessional[i][j] + " ");
                }
                System.out.println();
            }
        }

        if (level.equalsIgnoreCase("особый")) {

            System.out.println("Выберите высоту: ");
            int height = scanner.nextInt();
            if (height > 99) {
                height = 99;
                System.out.println(height);
            } else if (height < 1) {
                height = 1;
            }

            System.out.println("Выберите ширину: ");
            int width = scanner.nextInt();

            if (width > 99) {
                width = 99;
            } else if (width < 8) {
                width = 8;
            }

            System.out.println("Выберите количество мин: ");
            int quantityMine = scanner.nextInt();
            int multiplication = width * height;

            if (quantityMine >= multiplication) {
                quantityMine = multiplication - 1;
            }

            int[][] fieldSpecial = new int[height][width];
            for (int i = 0; i < quantityMine; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, height);
                int col = ThreadLocalRandom.current().nextInt(0, width);

                if (fieldSpecial[row][col] != 0) {
                    i--;
                } else {
                    fieldSpecial[row][col] = 7;
                }
            }

            for (int i = 0; i < fieldSpecial.length; i++) {
                for (int j = 0; j < fieldSpecial[i].length; j++) {
                    System.out.print(fieldSpecial[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


