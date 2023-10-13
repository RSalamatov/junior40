package lesson2;

public class Main7 {
    public static void main(String[] args) {

        int money = 10000;
        int year = 5;
        int prosent = 9;

        for (int month = 0; month <= year * 12; month++) {
            money = money + (money / 100 * prosent) / 12;
        }
        System.out.println(money);

    }
}
