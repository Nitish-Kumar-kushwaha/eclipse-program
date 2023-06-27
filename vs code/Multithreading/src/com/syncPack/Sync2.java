package com.syncPack;

class ShareResource1 {

    public void wish(String sname) {
        synchronized (this) {
            System.out.println("starting of method : ");
            for (int i = 0; i <= 10; i++) {
                System.out.println("good morning : " + sname);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            System.out.println("end of method : ");
        }
    }
}

class SyncMethod1 extends Thread {

    private String name;
    private ShareResource1 s;

    public SyncMethod1(String name, ShareResource1 s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        s.wish(name);
    }
}

public class Sync2 {

    public static void main(String[] args) {
        ShareResource1 s1 = new ShareResource1();
        SyncMethod1 sm1 = new SyncMethod1("Rashu", s1);

        sm1.start();

        ShareResource1 s2 = new ShareResource1();
        SyncMethod1 sm2 = new SyncMethod1("Nitish", s2);
        sm2.start();
    }
}
