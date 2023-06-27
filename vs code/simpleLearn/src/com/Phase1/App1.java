package com.Phase1;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char exp;

        System.out.println("Enter num1:");
        num1 = sc.nextDouble();
        System.out.println("enter num2");
        num2 = sc.nextDouble();
        System.out.println("enter the operation");
        exp = sc.next().charAt(0);

        Calculator cal = new Calculator(num1, num2);
        cal.operation(exp);

    }
}
