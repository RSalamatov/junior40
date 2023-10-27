package lesson17.threads;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl extends AbstractTask implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;

    public FindFilesTaskImpl(String directory, String searchString, PrintStream out) {
        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("directory == nell");
        }
        File starDir = new File(directory);
        if (!starDir.exists()) {
            throw new FileNotFoundException("starDir  not exists");

        }
        if (!starDir.isDirectory()) {
            throw new FileNotFoundException("directory is not directory");

        }
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null) {
            throw new IllegalArgumentException("searchString == null");


        }
        this.searchString = searchString;

    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        if (directory == null) {
            throw new TaskExecutionFailedException("directory == nell");
        }
        File startDir = new File(directory);
        if (!startDir.exists()) {
            throw new TaskExecutionFailedException("starDir  not exists");

        }
        if (!startDir.isDirectory()) {
            throw new TaskExecutionFailedException("directory is not directory");


    }

        //вытянули все папки и файлы которые содержат слово searchString
        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;

                }
                if (pathname.getName().contains(searchString)) {
                    return true;
                }

                return false;
            }
        });

        for (File file : files) {

            out.println(file.getAbsoluteFile());


        }
    }

    @Override
    public String toString() {
        return "FindFilesTaskImpl{" +
                "directory = '" + directory + '\'' +
                ", searchString = '" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
