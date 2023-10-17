package lesson15;

public class Test {
    public static void main(String[] args) {
        CopyWhithOneByte copyWhithOneByte = new CopyWhithOneByte();
        long time1 = System.currentTimeMillis();
        copyWhithOneByte.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test1.exe");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2 - time1));

        CopyWhizGuava copyWhizGuava = new CopyWhizGuava();
        long time3 = System.currentTimeMillis();
        copyWhizGuava.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test2.exe");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование по одному Guava: " + (time4 - time3));

        CopyWhithCommonIO copyWhithCommonIO = new CopyWhithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWhithCommonIO.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test3.exe");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование по одному Apache Common IO: " + (time6 - time5));

    }
}
