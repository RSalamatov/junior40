package lesson13;

import java.util.*;

public class Fridj {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacitv = 500;

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет ! ");
            return;
        }
        if (products.get(product) < weight) {
            System.out.println("Недостаточно " + product + " в холодильнике!");
            products.remove(product);
            return;
        }
        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weight);
    }

    /**
     * Добавить методы:
     * 1) Метод должен выводить на аконсоль те продукты, которые скоро закончатся (те, которых меньше 2 кг )
     * 2) Вывести на консоль продукт которого больше всеего в холодильнике
     * 3) Вывести на консоль продукты, отстортированные по названию
     * 4) **** Вывести на консоль продукты отсортированные по весу от меньшего
     */
    public void printProductWhichWillEndSoon() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() < 2) {
                System.out.println("Продукт который скоро закочатся: " + product.getKey());
            }
        }
    }

    public void productsWhichMore() {
        int maxValueInMap = Collections.max(products.values());
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() == maxValueInMap) {
                System.out.println("Продукт которого больше всего: " + product.getKey());
            }
        }
    }
    public void sortByName(){
        SortedSet<String> keys = new TreeSet<String>(products.keySet());
        System.out.println("Сортировка по наименованию: " + keys);
    }

}




