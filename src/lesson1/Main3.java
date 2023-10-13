package lesson1;

public class Main3 {
    public static void main(String[] args) {

        int sum = 10000;
        int weeks = 52;
        int sum2 = 2;
        int daysInWeek = 7;

        int quantityTuesday = sum / sum2;
        double quantityWeek = quantityTuesday / daysInWeek;
        double quantityYear = quantityWeek/weeks;


        System.out.println(quantityTuesday);
        System.out.println(quantityWeek);
        System.out.println(quantityYear);
    }

}

