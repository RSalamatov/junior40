package lesson3;

public class Main4 {
    public static void main(String[] args) {

        // Есть 2 знаменателя, нужно определить общий знаменатель

        int znam1 = 7;
        int znam2 = 3;

        int bigestZnam = znam1;
        if (znam2 > znam1) {
            bigestZnam = znam2;

        }
        for (int i = bigestZnam; i <= znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0){
                System.out.println(i);
                break;

            }

        }
    }
}
