package com.bridgelabz.basics;

// jvm calls the main method from where our code starts executing
// jvm has main thread responsible for calling the main method.
public class MainClass1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        sayMyName(); // <-Call

    }
    static void sayMyName() // <-Define
    {
        String name = "Prince Kumar";
        System.out.println(name);
    }
}

