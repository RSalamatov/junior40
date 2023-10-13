package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //this --- o1
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();

                }
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();

                }
                if (!o1.getMetall().equals(o2.getMetall())) {
                    return o1.getMetall().compareTo(o2.getMetall());

                }
                if (o1.getDiametr() != o2.getDiametr()) {
                    return Double.compare(o1.getDiametr(), o2.getDiametr());

                }

                // сортировка по году


                return 0;
            }
        });
        coins.add(new Coin(2.2, "Золото", 5, 1990));
        coins.add(new Coin(2.2, "Золото", 5, 1990));
        coins.add(new Coin(3, "Серебро", 8, 1952));
        coins.add(new Coin(5.5, "Латунь", 1, 1945));
        coins.add(new Coin(3.5, "Аллюминий", 5, 1924));


        for (Coin c : coins) {
            System.out.println(c);

        }
    }
}
