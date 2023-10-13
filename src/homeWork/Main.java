package homeWork;


import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        TreeSet<Teapot> teapots = new TreeSet<>();

        teapots.add(new Teapot("Черный", 4322, "DEXP", 2.2, 1800, true));
        teapots.add(new Teapot("Серый", 3999, "Polaris", 2.8, 2200, false));
        teapots.add(new Teapot("Белый", 2500, "Xiaomi", 1.6, 1900, true));
        teapots.add(new Teapot("Черный", 6400, "Redmond", 3.8, 1700, true));
        teapots.add(new Teapot("Красный", 7800, "Polaris", 5.8, 1600, false));
        teapots.add(new Teapot("Желтый", 9585, "Xiaomi", 2.0, 2000, true));


        SortButtons sortButtons = new SortButtons();
        sortButtons.sortByPriceFromTo(teapots);
        System.out.println();
        sortButtons.sortByPriceToFrom(teapots);
        System.out.println();
        sortButtons.sortByColour(teapots);
        System.out.println();
        sortButtons.sortByPower(teapots);
        System.out.println();
        sortButtons.sortByManufacturer(teapots);
        System.out.println();
        sortButtons.sortByInternalIllumination(teapots);
    }
}


