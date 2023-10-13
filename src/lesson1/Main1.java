package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int money = 1000;
        int priceOfSnikers = 35;
        double priceOfCandy = 3.5;
        int countSnikersCanBuy = money / priceOfSnikers;
        int restOfMoneyAfterSnikersBuy = money % priceOfSnikers;

        int countCandyBuy = (int) (restOfMoneyAfterSnikersBuy / priceOfCandy);
        double change = restOfMoneyAfterSnikersBuy - countCandyBuy * priceOfCandy;


        System.out.println(countSnikersCanBuy);
        System.out.println(restOfMoneyAfterSnikersBuy);
        System.out.println(countCandyBuy);
        System.out.println(change);

    }
}
