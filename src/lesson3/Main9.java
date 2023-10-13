package lesson3;

public class Main9 {
    public static void main(String[] args) {

        int summAllValue = 0;
        int[] arreyNumber = {2, 13, 46, 21, 7, 48, 24, 3, 11};

        for (int i = 0; i < arreyNumber.length; i++) {
            summAllValue = summAllValue + arreyNumber[i];
        }
        System.out.println(summAllValue);
    }
}
