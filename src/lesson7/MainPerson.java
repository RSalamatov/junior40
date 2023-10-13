package lesson7;

public class MainPerson {
    public static void main(String[] args) {


        PersonHome oleg = new PersonHome();
        oleg.setFullName("Petrov Oleg Petrovich");
        oleg.setAge(58);

        PersonHome misha = new PersonHome("Petrov Mihail Petrovich", 25);

        oleg.move();
        misha.talk();
    }
}
