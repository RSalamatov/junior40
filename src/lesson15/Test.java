package lesson15;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CopyWithOneByte copyWhithOneByte = new CopyWithOneByte();
        long time1 = System.currentTimeMillis();
        copyWhithOneByte.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test1.exe");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2 - time1));

        CopyWithGuava copyWhizGuava = new CopyWithGuava();
        long time3 = System.currentTimeMillis();
        copyWhizGuava.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test2.exe");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование по Guava: " + (time4 - time3));

        CopyWithCommonIO copyWhithCommonIO = new CopyWithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWhithCommonIO.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test3.exe");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование по Apache Common IO: " + (time6 - time5));

        CopyWithIOApi copyWhithIOApi = new CopyWithIOApi();
        long time7 = System.currentTimeMillis();
        copyWhithIOApi.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test4.exe");
        long time8 = System.currentTimeMillis();
        System.out.println("Копирование по IO API: " + (time8 - time7));

        CopyWithNioApi copyWhithNioApi = new CopyWithNioApi();
        long time9 = System.currentTimeMillis();
        copyWhithNioApi.copy("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "test5.exe");
        long time10 = System.currentTimeMillis();
        System.out.println("Копирование по NIO.2 API: " + (time10 - time9));
    }
}
