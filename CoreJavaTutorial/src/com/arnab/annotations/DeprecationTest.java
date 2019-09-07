package com.arnab.annotations;

public class DeprecationTest {

    /**
     * @deprecated Use the new print(String name) method instead.
     * @param name
     * @param message
     */
    @Deprecated
    public void print(String name, String message) {
        System.out.println("Hello, Mr. " + name.toUpperCase() + "! " + message);
    }

    public void print(String name) {
        System.out.println("Hello, Mr. " + name.toUpperCase() + "! Welcome to this great new world!");
    }

}
