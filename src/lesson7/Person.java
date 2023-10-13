package lesson7;

public class Person {

    // объявление характеристик(поля класса или переменные класса)
    private int age;
    private String name;

    private String surname;
    private String phoneNumber;
    private String address;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAdres(String adres) {
        this.address = adres;
    }

}
