package com.arnab.java.tutorial.annotations;

public class Main {

    public static void main(String[] args) {
        MyAnnotationTest test = new MyAnnotationTest();

        // This below method is a normal method and not a deprecated one.
        test.print("arnab banerjee");

        // The below method is deprecated marked in the source file. Hence the method here is struck off.
        test.print("arnab banerjee", "Welcome to this new world!");
    }

}

