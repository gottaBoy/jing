package com.gottaboy.jing.suanfa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreadSpecialLog implements LogInterface {

    private PrintWriter printWriter = null;

    public ThreadSpecialLog(final String fileName) {
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printLog(String log) {
        printWriter.println(log);
    }

    @Override
    public void closeLog() {
        printWriter.print("================= END OF LOG =================");
        printWriter.close();
    }
}
