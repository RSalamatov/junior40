package lesson3;

public class Main11 {
    public static void main(String[] args) {

        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] arreyGeneral = new char[8];

        for (int i = 0; i < qwer.length; i++) {
            arreyGeneral[i] = qwer[i];
        }
        for (int i = 0; i < abcd.length; i++) {
            arreyGeneral[qwer.length + i] = abcd[i];
        }
        System.out.println(arreyGeneral);
    }
}
