package com.Phase1;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of list ");
        int size = sc.nextInt();

        EmailValidation e = new EmailValidation(size);
        e.EnterEmail();
        System.out.print("\nEnter the Email to be search : ");
        String str = sc.next();
        e.Search(str);
    }
}
