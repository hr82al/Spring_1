package ru.geekbrains.java.Spring_1.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IPatient patient = context.getBean("patient", IPatient.class);
        patient.getMedicine();
    }
}
