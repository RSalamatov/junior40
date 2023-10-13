package lesson3;

public class Main1 {
    public static void main(String[] args) {
        // Есть масси чисел, нужно напечатать только четные числа в массиве и в обратном порядке

        int[] nums = {22, 43, 6, 3, 97, 10, 96};

        // 6 5 2 0

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0){
                System.out.println(nums[i]);

            }

        }

    }
}
