package Fileshandling;

import java.util.Scanner;

public class CourcseMain {
    public static void main(String[] args) throws Exception{
        Courcese cource = new Courcese();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("Entre the Cource Name:");
            String cname = sc.next();
            cource.AddNewCourcese(cname);
        }
        System.out.println("Entre Cource Name to search");

        String cname = sc.next();

        // if(){}

    }
}
