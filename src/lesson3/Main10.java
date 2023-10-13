package lesson3;

public class Main10 {
    public static void main(String[] args) {

        int differenceSummCell = 0;
        int summOddNumber = 0;
        int summEvenNumber = 0;
        int[] arreyNumber = {2, 13, 4, 12, 8, 8, 15, 24, 13};

        for (int i = 0; i < arreyNumber.length; i++) {
            if (i % 2 == 0) {
                summEvenNumber = summEvenNumber + arreyNumber[i];
            } else {
                summOddNumber = summOddNumber + arreyNumber[i];
            }
        }

        if (summOddNumber > summEvenNumber) {
            differenceSummCell = summOddNumber - summEvenNumber;
        } else {
            differenceSummCell = summEvenNumber - summOddNumber;
        }
        System.out.println(summEvenNumber);
        System.out.println(summOddNumber);
        System.out.println(differenceSummCell);
    }
}

