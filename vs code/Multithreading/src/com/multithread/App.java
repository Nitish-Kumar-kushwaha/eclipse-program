package com.multithread;

class App1 extends Thread {
    public void run() {
        System.out.println("this is thread 1");
    }

}
// implemnting runnable interface

class App2 implements Runnable {
    public void run() {
        System.out.println("this is thread 2 ");
    }

}

public class App extends Thread {
    public void run() {
        System.out.println("thread  is running ");
    }

    public static void main(String[] args) {
        App1 te1 = new App1();
        te1.start();

        App te2 = new App();
        te2.start();

        Thread t1 = new Thread(new App2());
        t1.start();
        System.out.println("this is main thread");
    }
}
