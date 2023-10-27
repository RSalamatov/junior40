package lesson17.threads;

import lesson15.*;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\537.58-desktop-win10-win11-64bit-international-dch-whql.exe", "A:\\COPY JAVA\\1.exe");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\ideaIC-2023.2.1.exe", "A:\\COPY JAVA\\2.exe");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\jdk-20_windows-x64_bin.exe", "A:\\COPY JAVA\\3.exe");
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\54tg5g.exe", "A:\\COPY JAVA\\54tg5g.exe");
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\iCloud Photos (4).zip", "A:\\COPY JAVA\\5.zip");
        CopyFileTaskImpl task6 = new CopyFileTaskImpl("C:\\Users\\Userq\\Downloads\\iCloud Photos (4).zip", "A:\\COPY JAVA\\6.zip");
        task1.setFileCopyUtils(new CopyWithGuava());
        task2.setFileCopyUtils(new CopyWithCommonIO());
        task3.setFileCopyUtils(new CopyWithIOApi());
        task4.setFileCopyUtils(new CopyWithNioApi());
        task5.setFileCopyUtils(new CopyWithOneByte());
        task6.setFileCopyUtils(new CopyWithOneByte());

        Task task7 = new FindFilesTaskImpl("C:\\Users\\User\\Downloads", "win", System.out);
        Task task8 = new FindFilesTaskImpl("C:\\Users\\User\\Downloads", "idea", System.out);
        Task task9 = new FindFilesTaskImpl("C:\\Users\\User\\Downloads", "zip", System.out);
        Task task10 = new FindFilesTaskImpl("C:\\Users\\User\\Downloads", "Программа", System.out);
        Task task11 = new FindFilesTaskImpl("C:\\Users\\User\\Downloads", "ef4g4g", System.out);
        Task task12 = new FindFilesTaskImpl("C:\\Users\\User\\Downloadsccca", "win", System.out);

        TasksStorage storage = new TaskStorageImpl();

        storage.add(task1);
        storage.add(task5);
        storage.add(task10);
        storage.add(task3);
        storage.add(task6);
        storage.add(task11);

        storage.add(task12);
        storage.add(task7);
        storage.add(task2);
        storage.add(task8);
        storage.add(task4);
        storage.add(task9);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
