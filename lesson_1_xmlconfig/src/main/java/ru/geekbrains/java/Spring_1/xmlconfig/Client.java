package ru.geekbrains.java.Spring_1.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        PatientImpl patient = new PatientImpl();
//        WaitingRoomImpl waitingRoom = new WaitingRoomImpl();
//        waitingRoom.servePatient(patient);
//        patient.getMedicine();
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PatientImpl patient= context.getBean("patient", PatientImpl.class);
        patient.getMedicine();
    }
}
