package library;

import java.util.ArrayList;

public class Magazines extends PrintedPublications {

    private int numberInYear;

    public Magazines() {
    }

    public Magazines(String name, int yearsOfPublication, String publishingHouse, ArrayList<PrintedPublications> printer, int numberInYear) {
        super(name, yearsOfPublication, publishingHouse, printer);
        this.numberInYear = numberInYear;
    }

    public Magazines(String title, int yearsOfPublication, int numberInYear, String publishingHouse) {
        this.name = title;
        this.yearsOfPublication = yearsOfPublication;
        this.numberInYear = numberInYear;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazines magazines = (Magazines) o;

        return numberInYear == magazines.numberInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberInYear;
        return result;
    }



    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setYearsOfPublication(int yearsOfPublication) {
        this.yearsOfPublication = yearsOfPublication;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void printName() {
        System.out.println(this.name + "," + this.yearsOfPublication + "," + this.numberInYear + "," + this.publishingHouse);
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "numberInYear=" + numberInYear +
                '}';
    }
}
