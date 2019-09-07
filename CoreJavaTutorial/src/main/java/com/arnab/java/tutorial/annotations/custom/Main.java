package com.arnab.java.tutorial.annotations.custom;

public class Main {
    public static void main(String[] args) {
        CustomAnnotationDemo demo = new CustomAnnotationDemo(1, "Arnab",
                "Banerjee", "Kolkata", "West Bengal");
        System.out.println(demo);
        System.out.println();

        Class<? extends CustomAnnotationDemo> demoClass = demo.getClass();
        CustomAnnotation customAnnotation = (CustomAnnotation) demoClass.getAnnotation(CustomAnnotation.class);
        ArnabClassLevel arnabClassLevel = (ArnabClassLevel) demoClass.getAnnotation(ArnabClassLevel.class);
        ArnabFieldLevel arnabFieldLevel = (ArnabFieldLevel) demoClass.getAnnotation(ArnabFieldLevel.class);
        ArnabConstructorLevel arnabConstructorLevel = (ArnabConstructorLevel) demoClass.getAnnotation(ArnabConstructorLevel.class);
        ArnabMethodLevel arnabMethodLevel = (ArnabMethodLevel) demoClass.getAnnotation(ArnabMethodLevel.class);

        System.out.println("CustomAnnotation type: " + customAnnotation.annotationType());
        System.out.println("CustomAnnotation value: " + customAnnotation.value());
        System.out.println("CustomAnnotation id: " + customAnnotation.id());
        for(String value: customAnnotation.values()) {
            System.out.println("CustomAnnotation values: " + value);
        }
        System.out.println("CustomAnnotation level: " + customAnnotation.level());
        System.out.println();

        System.out.println("ArnabClassLevel type: " + arnabClassLevel.annotationType());
        System.out.println("ArnabClassLevel value: " + arnabClassLevel.value());
        System.out.println();

        System.out.println("ArnabFieldLevel type: " + arnabFieldLevel.annotationType());
        System.out.println("ArnabFieldLevel value: " + arnabFieldLevel.value());
        System.out.println();

        System.out.println("ArnabConstructorLevel type: " + arnabConstructorLevel.annotationType());
        System.out.println("ArnabConstructorLevel value: " + arnabConstructorLevel.value());
        System.out.println();

        System.out.println("ArnabMethodLevel type: " + arnabMethodLevel.annotationType());
        System.out.println("ArnabMethodLevel value: " + arnabMethodLevel.value());
        System.out.println();


    }
}
