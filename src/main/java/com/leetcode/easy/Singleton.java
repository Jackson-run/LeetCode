package com.leetcode.easy;


public class Singleton{
    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }
    private Singleton(){}
    public static Singleton newInstance(){
        return SingletonHolder.instance;
    }
}

class Singleton2 {
    private static volatile Singleton2 instance = null;
    private Singleton2() {
    }
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
