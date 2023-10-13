package lesson4;

public class Main {
    public static void main(String[] args) {

        int[] nums = {43, 65, 24, 22, 4, 14, 134, 504};

        for (int n : nums) {
            String numInText = n + "";
            if (numInText.contains("4")) {
                System.out.println(numInText);
            }
        }
    }
}
