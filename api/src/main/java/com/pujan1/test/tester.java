package com.pujan1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class tester {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(app.class);

        context.close();
    }
}
