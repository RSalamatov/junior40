package lesson3;

public class Main6 {
    public static void main(String[] args) {

        int[] arreyNumber = {2, 13, 46, 21, 7, 48, 24, 3, 11};

        for (int i = 0; i < arreyNumber.length; i++) {
            if (arreyNumber[i] > 10 && arreyNumber[i] < 25) {
                System.out.println(arreyNumber[i]);
            }
        }
    }
}
