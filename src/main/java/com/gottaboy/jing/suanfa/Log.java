package com.gottaboy.jing.suanfa;
// https://blog.csdn.net/ryo1060732496/category_9272287.html
// https://blog.csdn.net/ryo1060732496/article/details/80099013
// Thread Special Storage 模式
//Thread Special Storage 模式是一种即使只有一个入口，也会为每一个线程分配特有的存储空间的模式。
public class Log {
    private static final ThreadLocal<ThreadSpecialLog> tsLogCollection = new ThreadLocal<>();

    public static void printLog(String log) {
        getTsLog().printLog(log);
    }

    public static void closeLog() {
        getTsLog().closeLog();
    }

    private static LogInterface getTsLog() {
        ThreadSpecialLog threadSpecialLog = tsLogCollection.get();
        if(null == threadSpecialLog) {
            String fileName = Thread.currentThread().getName()+"-log.txt";
            threadSpecialLog = new ThreadSpecialLog(fileName);
            tsLogCollection.set(threadSpecialLog);
            return threadSpecialLog;
        }
        return threadSpecialLog;
    }
}
