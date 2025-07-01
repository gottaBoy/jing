package com.gottaboy.jing.suanfa;

public class ClientThread extends Thread {

    public ClientThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("MAIN BEGIN...");
        for(int i = 0; i < 10; i++) {
            Log.printLog("log-"+i);
        }
        Log.closeLog();
        System.out.println("MAIN END...");
    }

}
