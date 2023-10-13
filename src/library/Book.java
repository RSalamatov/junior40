package library;

import java.util.ArrayList;

public class Book extends PrintedPublications {

    private String autor;
    private int numberOfPages;


    public Book() {
    }

    public Book(String name, int yearsOfPublication, String publishingHouse, ArrayList<PrintedPublications> printer, String autor, int numberOfPages) {
        super(name, yearsOfPublication, publishingHouse, printer);
        this.autor = autor;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, int yearsOfPublication, int numberOfPages, String publishingHouse) {
        this.name = title;
        this.yearsOfPublication = yearsOfPublication;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void printName() {
        System.out.println(this.name + "," + this.yearsOfPublication + "," + this.numberOfPages + "," + this.publishingHouse);
    }

    public void printEdition() {

        int mostOfAllPages = 0;
        for (PrintedPublications p: printer)
            if (numberOfPages > mostOfAllPages) {
                this.numberOfPages = mostOfAllPages;
            }
    }
}

