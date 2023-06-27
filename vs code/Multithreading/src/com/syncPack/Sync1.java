package com.syncPack;

class ShareResource {
    public synchronized void wish(String sname) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("good morning" + sname);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class SyncMethod extends Thread {
    private String name;
    private ShareResource s;

    public SyncMethod(String name, ShareResource s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        s.wish(name);
    }

}

public class Sync1 {
    public static void main(String[] args) {
        ShareResource s1 = new ShareResource();
        SyncMethod sm1 = new SyncMethod("Satyam", s1);

        sm1.start();

        ShareResource s2 = new ShareResource();
        SyncMethod sm2 = new SyncMethod("Nitish", s2);
        sm2.start();
    }

}
