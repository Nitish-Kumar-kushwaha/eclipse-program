package VirtualKey;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class VirtualKey {

    public void ViewAllFiles() {

        File dir = new File("/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/VirtualKey/VirtualKeyFolder/");
        String[] files = dir.list();
        if (files == null)
            System.out.println("Directory is empty");
        else {
            Arrays.sort(files);
            System.out.println("List of Files:");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
    }

    public void AddNewFile(String filename, String content) throws IOException {
        File file = new File("/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/VirtualKey/VirtualKeyFolder/" + filename + ".txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write(content);
        fw.close();
        System.out.println("A new file has been created");
    }

    public void DeleteFile(String filename) {
        boolean bool = false;
        File dir = new File("/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/VirtualKey/VirtualKeyFolder/");
        File[] files = dir.listFiles();
        if (files == null)
            System.out.println("Directory is empty");
        else {
            for (int i = 0; i < files.length; i++) {
                if (filename.equals(files[i].getName())) {
                    files[i].delete();
                    System.out.println("File deleted successfully");
                    bool = true;
                }
            }
            if (bool == false)
                System.out.println("File is not present in the system");
        }
    }

    public void SearchFile(String filename) {
        boolean bool = false;
        File dir = new File("/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/VirtualKey/VirtualKeyFolder/");
        String[] files = dir.list();
        if (files == null)
            System.out.println("Directory is empty");
        else {
            for (int i = 0; i < files.length; i++) {
                if (filename.equals(files[i])) {
                    System.out.println("File is present in the system");
                    bool = true;
                }
            }
            if (bool == false)
                System.out.println("File is not present in the system");
        }
    }
}
