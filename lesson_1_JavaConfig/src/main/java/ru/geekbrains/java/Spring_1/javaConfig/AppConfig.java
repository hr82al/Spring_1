package ru.geekbrains.java.Spring_1.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "patient")
    public IPatient patient(){
        return new PatientImpl();
    }

    @Bean(name = "card")
    public IMedicalCard card(IPatient patient){
        MedicalCardImpl medicalCard = new MedicalCardImpl();
        medicalCard.searchMedicalCard(patient);
        return medicalCard;
    }
}
