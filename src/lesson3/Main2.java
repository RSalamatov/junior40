package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // создать массив с длиной в 10 ячеек и наполнить его числами кратными трём от 30 и пока не заполнится массив
        // вывести массив на консоль в качестве результата

        int[] nums = new int[10];

        int value = 30;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
            value = value + 3;
            System.out.println(nums[i]);

        }
    }
}
