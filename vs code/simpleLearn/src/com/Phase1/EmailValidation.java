package com.Phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

    private ArrayList<String> list;
    private int size;

    public EmailValidation(int size) {
        this.size = size;
        list = new ArrayList<String>();
    }

    public void EnterEmail() {

        if (size <= 0) {
            System.out.println("List is Empty!!!!");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the emails");
        for (int i = 0; i < size; i++) {
            String str = sc.next();
            list.add(str);
        }
    }

    public void Search(String str) {
        if (list.size() == 0) {
            System.out.println("List is empty!!!!");
            System.exit(0);
        }
        if (list.contains(str)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

    }
}
