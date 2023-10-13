package lesson5;

public class MathUtils {


    public static int getMathPerimeterTreug(int sideA, int sideB, int sideC) {
        int perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public static double getMathPloshadTreug(double a, double b, double c, double halfP) {
        double square = Math.sqrt((halfP * (halfP - a) * (halfP - b) * (halfP - c)));
        return square;
    }

    public static double getMathPloshadKrug(int radius) {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public static double getMathPerimeterKrug(int radius) {
        double square = 2 * 3.14 * radius;
        return square;
    }

    public static double getMathPloshadOval(int a, int b) {
        double square = 3.14 * a * b;
        return square;
    }

    public static double getMathPerimeterOval(int a, int b) {
        double perimeter = 4 * ((3.14 * a * b + Math.pow(a - b, 2)) / (a + b));
        return perimeter;
    }

    public static int getMathPloshadPrymoug(int a, int b) {
        int square = a * b;
        return square;
    }

    public static int getMathPerimeterPrymoug(int a, int b) {
        int perimeter = (a + b) * 2;
        return perimeter;
    }

    public static double getMathPloshadKvadrat(int a) {
        double square = Math.pow(a, 2);
        return square;
    }

    public static int getMathPerimeterKvadrat(int a) {
        int perimeter = 4 * a;
        return perimeter;
    }

    public static int getMathPloshadTrap(int a, int b, int c) {
        int square = ((a + b) / 2) / c;
        return square;
    }

    public static int getMathPerimeterTrap(int a, int b, int c, int d) {
        int perimeter = a + b + c + d;
        return perimeter;
    }
}

