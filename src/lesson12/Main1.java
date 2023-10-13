package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(82);
        nums.add(35);
        nums.add(54);
        nums.add(46);
        nums.add(72);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });


        for (Integer num : nums) {
            System.out.println(num);

        }
    }
}
