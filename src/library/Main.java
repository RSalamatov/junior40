package library;

public class Main {
    public static void main(String[] args) {

        PrintedPublications printedPublications = new PrintedPublications();
        Book books = new Book();

        printedPublications.addBooksAndMagazines();
        printedPublications.showEditions();
        printedPublications.printLargestBook();


    }
}
