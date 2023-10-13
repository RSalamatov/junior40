package lesson7;

public class PersonHome {

    private String fullName;
    private int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " двигается");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public PersonHome(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public PersonHome() {
    }
}
