package com.multithread;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            } finally {
                System.out.println(this.getName() + " prioritiy: " + this.getPriority());
                this.setPriority(3);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            } finally {
                System.out.println(this.getName() + " prioritiy: " + this.getPriority());
                this.setPriority(8);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();
        System.out.println("first thread name:" + t1.getName());
        System.out.println("first thread name:" + t2.getName());

    }

}
