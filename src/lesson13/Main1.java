package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridj fridj = new Fridj();
        fridj.addProduct("Бананы", 3);
        fridj.addProduct("Бананы", 5);
        fridj.addProduct("Сливы", 1);
        fridj.addProduct("Творог", 9);
        fridj.addProduct("Арбузы", 9);
        fridj.addProduct("Лимоны", 1);
        fridj.addProduct("Грибы", 1);
        fridj.addProduct("Огурцы", 3);
        fridj.addProduct("Помидоры", 9);
        fridj.addProduct("Картофель", 6);
        fridj.addProduct("Шпинат", 1);
        fridj.addProduct("Гречка", 2);
        fridj.getProduct("Картофель", 5);

        fridj.printAllProducts();

        fridj.printProductWhichWillEndSoon();
        fridj.productsWhichMore();
        fridj.sortByName();
    }
}
