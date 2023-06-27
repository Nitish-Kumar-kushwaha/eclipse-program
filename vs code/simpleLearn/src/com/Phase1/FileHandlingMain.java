package com.Phase1;

import java.io.IOException;

public class FileHandlingMain {
    public static void main(String[] args) throws IOException {
        FileHandling f = new FileHandling();

        f.writeInsideFile();
        f.readFromFile();
        f.appendToFile();
    }
}
