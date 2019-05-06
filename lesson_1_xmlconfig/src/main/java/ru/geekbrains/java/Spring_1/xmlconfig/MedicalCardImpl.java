package ru.geekbrains.java.Spring_1.xmlconfig;

public class MedicalCardImpl implements IMedicalCard{
    public void searchMedicalCard(IPatient patient) {
        System.out.println("Найдена карта пациента. Офомлено посещение врача.");
    }
}
