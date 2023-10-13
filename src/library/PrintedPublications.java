package library;

import java.util.ArrayList;
import java.util.Objects;

public class PrintedPublications {
    public String name;
    public int yearsOfPublication;
    public String publishingHouse;

    public PrintedPublications() {
    }

    public PrintedPublications(String name, int yearsOfPublication, String publishingHouse, ArrayList<PrintedPublications> printer) {
        this.name = name;
        this.yearsOfPublication = yearsOfPublication;
        this.publishingHouse = publishingHouse;
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setYearsOfPublication(int yearsOfPublication) {
        this.yearsOfPublication = yearsOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public ArrayList<PrintedPublications> getPrinter() {
        return printer;
    }

    public void setPrinter(ArrayList<PrintedPublications> printer) {
        this.printer = printer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintedPublications that = (PrintedPublications) o;

        if (yearsOfPublication != that.yearsOfPublication) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(publishingHouse, that.publishingHouse))
            return false;
        return Objects.equals(printer, that.printer);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearsOfPublication;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + (printer != null ? printer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintedPublications{" +
                "name='" + name + '\'' +
                ", yearsOfPublication=" + yearsOfPublication +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", printer=" + printer +
                '}';
    }

    public ArrayList<PrintedPublications> printer = new ArrayList<>();

    public void addBooksAndMagazines() {
        printer.add(new Book("Война и мир", 1863, 1350,
                "Война и Мир"));
        printer.add(new Book("Нокс, Сирены", 2017, 560,
                "Азбука"));
        printer.add(new Book("История России", 2005, 786,
                "РФ"));
        printer.add(new Magazines("Космополитан", 1880, 586460,
                "Cosmopolitan"));
        printer.add(new Magazines("У руля", 1980, 5874,
                "Москвич457"));
        printer.add(new Magazines("Все о рыбалке", 2000, 5547,
                "Рыбаки"));
    }


    public void printName() {
    }

    public void showEditions() {
        for (PrintedPublications p : printer) {
            p.printName();
//            System.out.println(p);
        }
    }

    public void printLargestBook() {
        PrintedPublications largest = new Book("Заглушка", 1863, -1,
                "Война и Мир");
        for (PrintedPublications p : printer) {
            if (p instanceof Book) {
                if (((Book) p).getNumberOfPages() > ((Book) largest).getNumberOfPages()) {
                    largest = p;
                }
            }
        }
        System.out.println(largest);
    }
}

