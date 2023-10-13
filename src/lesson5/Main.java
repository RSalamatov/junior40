package lesson5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigure(); // рекурсивный вызов

        if (figura.equals("1") || figura.equalsIgnoreCase("Круг")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int radius = ScannerUtil.getParametr("Введите радиус");

            if (action.equalsIgnoreCase("Площадь")) {
                double ploshad = MathUtils.getMathPloshadKrug(radius);
                System.out.println("Площадь круга: " + ploshad);

            } else {
                double perimeter = MathUtils.getMathPerimeterKrug(radius);
                System.out.println("Периметр круга: " + 2 * 3.14 * radius);
            }
        }
        if (figura.equals("2") || figura.equalsIgnoreCase("Овал")) {
            String action = ScannerUtil.getAction();
            int lengthBigA = ScannerUtil.getParametr("Введите длину оси а: ");
            int lengthLittleB = ScannerUtil.getParametr("Введите длину оси b: ");

            if (action.equalsIgnoreCase("Площадь")) {
                double ploshad = MathUtils.getMathPloshadOval(lengthBigA, lengthLittleB);
                System.out.println("Площадь эллипса: " + ploshad);

            } else {
                double perimeter = MathUtils.getMathPerimeterOval(lengthBigA, lengthLittleB);
                System.out.println("Периметр эллипса: " + perimeter);
            }
        }
        if (figura.equals("3") || figura.equalsIgnoreCase("Прямоугольник")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int length = ScannerUtil.getParametr("Введите длину");
            int width = ScannerUtil.getParametr("Введите ширину");

            if (action.equalsIgnoreCase("Площадь")) {
                int ploshad = MathUtils.getMathPloshadPrymoug(length, width);
                System.out.println("Площадь прямоугольника: " + ploshad);

            } else {
                int perimeter = MathUtils.getMathPerimeterPrymoug(length, width);
                System.out.println("Периметр прямоугольника: " + perimeter);
            }
        }
        if (figura.equals("4") || figura.equalsIgnoreCase("Треугольник")) {
            String action = ScannerUtil.getAction();
            int sideA = ScannerUtil.getParametr("Введите сторону a");
            int sideB = ScannerUtil.getParametr("Введите сторону b");
            int sideC = ScannerUtil.getParametr("Введите сторону c");
            int halfP = (sideA + sideB + sideC) / 2;
            if (action.equalsIgnoreCase("Периметр")) {
                int perimeter = MathUtils.getMathPerimeterTreug(sideA, sideB, sideC);
                System.out.println("Периметр треугольника" + perimeter);
            } else {
                double ploshad = MathUtils.getMathPloshadTreug(sideA, sideB, sideC, halfP);
                System.out.println("Площадь треугольника" + ploshad);
            }
        }
//
        if (figura.equals("5") || figura.equalsIgnoreCase("Квадрат")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int sideSquare = ScannerUtil.getParametr("Введите сторону квадрата а");

            if (action.equalsIgnoreCase("Площадь")) {
                double ploshad = MathUtils.getMathPloshadKvadrat(sideSquare);
                System.out.println("Площадь квадрата: " + ploshad);

            } else {
                int perimeter = MathUtils.getMathPerimeterKvadrat(sideSquare);
                System.out.println("Периметр квадрата: " + perimeter);
            }
        }
        if (figura.equals("6") || figura.equalsIgnoreCase("Трапеция")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int lengthOne = ScannerUtil.getParametr("Введите длину первого основания а");
            int lengthTwo = ScannerUtil.getParametr("Введите длину второго основания b");

            if (action.equalsIgnoreCase("Площадь")) {
                int height = ScannerUtil.getParametr("Введите высоту трапеции");
                int ploshad = MathUtils.getMathPloshadTrap(lengthOne, lengthTwo, height);
                System.out.println("Площадь трапеции: " + ploshad);

            } else {
                int lengthThree = ScannerUtil.getParametr("Введите длину боковой стороны c");
                int lengthFour = ScannerUtil.getParametr("Введите длину боковой стороны d");
                int perimeter = MathUtils.getMathPerimeterTrap(lengthOne, lengthTwo, lengthThree, lengthFour);
                System.out.println("Периметр трапеции: " + perimeter);
            }
        }
    }
}