package ru.geekbrains.java.Spring_1.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class PatientImpl implements IPatient {
    private IMedicalCard medicalCard;
    private int cabinetNumber;

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
        System.out.println("Пациент получил направление к врачу.");
    }

    public void getMedicine() {
        System.out.println("Пациент получил лечение.");
    }

    public IMedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setCard(MedicalCardImpl card) {
        this.medicalCard = medicalCard;
        System.out.println("Пациент получил карточку.");
    }
}
