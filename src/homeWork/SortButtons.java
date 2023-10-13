package homeWork;


import lesson12.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {

    public void sortByPower(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());

                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }
                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());

                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByPriceFromTo(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());
                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }
                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }

                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByPriceToFrom(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o2.getPrice() != o1.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
                if (o2.getColour().equals(o1.getColour())) {
                    return o2.getColour().compareTo(o1.getColour());
                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o2.getManufacturer().compareTo(o1.getManufacturer());
                }
                if (o2.getPower() != o1.getPower()) {
                    return o2.getPower() - o1.getPower();
                }
                if (o2.getVolume() != o1.getVolume()) {
                    return Double.compare(o2.getPower(), o1.getPower());
                }

                if (o2.isInternalIllumination() != o1.isInternalIllumination()) {
                    return Boolean.compare(o2.isInternalIllumination(), o1.isInternalIllumination());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByVolume(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }
                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByColour(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }

                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByManufacturer(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }
                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());
                }
                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByInternalIllumination(TreeSet<Teapot> teapots) {
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if (o1.isInternalIllumination() != o2.isInternalIllumination()) {
                    return Boolean.compare(o1.isInternalIllumination(), o2.isInternalIllumination());
                }
                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getPower(), o2.getPower());
                }
                if (o1.getManufacturer().equals(o2.getManufacturer())) {
                    return o1.getManufacturer().compareTo(o2.getManufacturer());
                }
                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getColour().equals(o2.getColour())) {
                    return o1.getColour().compareTo(o2.getColour());
                }
                return 0;
            }
        });
        forSorting.addAll(teapots);

        for (Teapot t : forSorting) {
            System.out.println(t);
        }
    }
}
