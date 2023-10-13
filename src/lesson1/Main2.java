package lesson1;

public class Main2 {

    public static void main(String[] args) {
        int widthTable = 1;
        double lengthTable = 1.5;
        int widthRoom = 3;
        double lengthRoom = 4.5;

        double sTable = widthTable * lengthTable;
        double sRoom = widthRoom * lengthRoom;
        int quantityTable = (int) (sRoom / sTable);



        System.out.println(sTable);
        System.out.println(sRoom);
        System.out.println(quantityTable);
    }
}
