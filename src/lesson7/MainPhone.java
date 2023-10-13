package lesson7;

public class MainPhone {
    public static void main(String[] args) {

        Phone iphone = new Phone();
        iphone.setModel("Iphone");
        iphone.setNumber("+79165487845");
        iphone.setWeight(161);

        Phone samsung = new Phone();
        samsung.setModel("Samsung");
        samsung.setNumber("+79824573727");
        samsung.setWeight(150);

        Phone xiaomi = new Phone();
        xiaomi.setModel("Xiaomi");
        xiaomi.setNumber("+79268458789");
        xiaomi.setWeight(241);
        System.out.println(iphone.getModel() + " " + iphone.getNumber() + " " + iphone.getWeight());
        System.out.println(samsung.getModel() + " " + samsung.getNumber() + " " + samsung.getWeight());
        System.out.println(xiaomi.getModel() + " " + xiaomi.getNumber() + " " + xiaomi.getWeight());

        iphone.receiveCall("Алексей");

        Phone iphone2 = new Phone("+79264587898", "Iphone", 45);
        Phone iphone3 = new Phone ("+79165487987", "Samsung");
    }
}
