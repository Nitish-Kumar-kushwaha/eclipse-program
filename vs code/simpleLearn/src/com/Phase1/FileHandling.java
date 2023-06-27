package com.Phase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    private String path = "/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/com/Phase1/file.txt";

    public void writeInsideFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of line you wnat to write : ");

        int size = sc.nextInt();

        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter w = new BufferedWriter(fr);

            for (int i = 0; i <= size; i++) {
                String str = sc.nextLine();
                w.write(str);
            }
            w.close();
        } catch (Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
        System.out.println("File written sucess fulll");
    }

    public void readFromFile() throws IOException {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader r = new BufferedReader(fr);

            System.out.println("file reading .............");

            String str;

            while ((str = r.readLine()) != null) {
                System.out.println(str);

            }
            r.close();
        } catch (Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }

    public void appendToFile() throws IOException {
        try {
            FileWriter fr = new FileWriter(path , true);
            BufferedWriter w = new BufferedWriter(fr);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the line to be appended : ");
            int size = sc.nextInt();

            for (int i = 0; i <=size; i++) {
                String str = sc.nextLine();
                w.write(str);
            }
            w.close();
        } catch (Exception e) {
            System.out.println("something went wrong !!!");
            e.printStackTrace();
        }
        System.out.println("Appended sucessfull !!!!!");

    }

}
