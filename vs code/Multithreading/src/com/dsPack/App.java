package com.dsPack;

public class App {
    public static void main(String[] args) {
        Stack sc = new Stack(5);
        sc.push(1);
        sc.push(23);
        sc.push(34);
        sc.push(78);
        sc.push(34);
        // sc.push(234);

        System.out.println(sc.peek());
        sc.show();
        sc.pop();
        System.out.println();
        sc.show();
    }
}
