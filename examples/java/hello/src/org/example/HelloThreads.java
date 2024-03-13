package org.example;

public class HelloThreads {
    private static void hello() {
        var t1 = new Thread(() -> System.out.println("Hello from thread 1"));
        var t2 = new Thread(() -> System.out.println("Hello from thread 2"));
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        System.out.println("====== Hello Threads    =======");
        hello();
        System.out.println("====== Good Bye Threads =======");
    }
}