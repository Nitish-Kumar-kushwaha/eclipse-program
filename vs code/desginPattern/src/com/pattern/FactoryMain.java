package com.pattern;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        GetPlanFactory gpf = new GetPlanFactory();
        Scanner sc = new Scanner(System.in);
        Plan p = null;

        do {
            System.out.println("1. Domestic Plan \n2. Commercial Plan \n3.Institutinal Plan\n");
            System.out.println("pick the plan : ");
            int ch = sc.nextInt();
            if (ch > 3) {
                System.out.println("thanks for using the app");
                System.exit(0);
            }
            System.out.println("entre the number of units");
            int units = sc.nextInt();

            switch (ch) {
                case 1:
                    p = gpf.getPlan("DP");
                    p.getRate();
                    System.out.println("Bill amount for domestic plan : ");
                    p.calculateBill(units);
                    break;
                case 2:
                    p = gpf.getPlan("CP");
                    p.getRate();
                    System.out.println("Bill amount for commercial plan : ");
                    p.calculateBill(units);
                    break;
                case 3:
                    p = gpf.getPlan("IP");
                    p.getRate();
                    System.out.println("Bill amount for institutinal plan : ");
                    p.calculateBill(units);
                    break;
                default:

            }
        } while (true);

    }
}
