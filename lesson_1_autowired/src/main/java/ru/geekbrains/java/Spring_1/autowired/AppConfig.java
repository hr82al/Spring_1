package ru.geekbrains.java.Spring_1.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.geekbrains.java.Spring_1.autowired")
public class AppConfig {
//    @Bean(name = "patient")
//    public IPatient patient(){
//        return new PatientImpl();
//    }
//
//    @Bean(name = "card")
//    public IMedicalCard card(IPatient patient){
//        MedicalCardImpl medicalCard = new MedicalCardImpl();
//        medicalCard.searchMedicalCard(patient);
//        return medicalCard;
//    }
}
