package lesson6;

public class Main2 {
    public static void main(String[] args) {

        StringUtilsHome.stringMethods("метод принимает входящими параметрами текст и возвращает кол-во гласных букв в тексте");

        StringUtilsHome.reverseString("Возвращает строку в обратном порядке");

        StringUtilsHome.punctuationMarks("Мет,од! во:зв;ращает (зн)аки пр!епи?нания.");

        int row = 10;
        int col = 10;
        StringUtilsHome.printSquare(row, col);
    }
}
