package com.arnab.java.tutorial.annotations.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
Java annotations properties are also called Elements.
It is a custom annotation - CustomAnnotation
The elements are -
    value - Just holds the description. The default value mentioned after demonstrating the level.
    id - The ID. The default value mentioned after demonstrating the level.
    values - Just a String array to demonstrate the data type and about the data. The default value mentioned after demonstrating the level.
    level - To denote class level.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String value() default "CustomAnnotationDemo class";
    int id() default 1;
    String[] values() default {"The default value at class level."};
    String level() default "Class level.";
}
