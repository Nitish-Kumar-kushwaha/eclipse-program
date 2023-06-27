package com.dsPack;

public class App1 {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.queue(5);
        q.queue(9);
        q.queue(4);
        q.queue(10);
        q.queue(98);

        q.show();
        System.out.println(q.rearElement());
        System.out.println(q.frontElement());
        System.out.println("is empty:" + q.isEmpty());
        System.out.println("size : " + q.size());
        
    }
}
