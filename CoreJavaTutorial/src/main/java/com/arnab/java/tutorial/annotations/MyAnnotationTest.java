package com.arnab.java.tutorial.annotations;

/*
Here the @MyFirstAnnotation is the custom defined annotation.
 */
@MyFirstAnnotation
public class MyAnnotationTest {

    /**
     * @deprecated Use the new print(String name) method instead.
     * @param name
     * @param message
     */
    @MyFirstAnnotation
    @Deprecated
    public void print(String name, String message) {
        System.out.println("Hello, Mr. " + name.toUpperCase() + "! " + message);
    }

    @MyFirstAnnotation
    public void print(String name) {
        System.out.println("Hello, Mr. " + name.toUpperCase() + "! Welcome to this great new world!");
    }

}
