package com.gottaboy.jing.suanfa;

public class Main {

    public static void main(String[] args) {
        new ClientThread("One").start();
        new ClientThread("Two").start();
        new ClientThread("Three").start();
    }
}
