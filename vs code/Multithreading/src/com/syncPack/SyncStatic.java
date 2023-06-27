package com.syncPack;

class ShareResource2 {
    public synchronized static void wish(String sname) {

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

class SyncMethod2 extends Thread {
    private String name;

    public SyncMethod2(String name) {
        this.name = name;

    }

    public void run() {
        ShareResource2.wish(name);
    }

}

public class SyncStatic {
    public static void main(String[] args) {

        SyncMethod2 sm1 = new SyncMethod2("Rashu");
        sm1.start();

        SyncMethod2 sm2 = new SyncMethod2("Nitish");
        sm2.start();
    }

}
