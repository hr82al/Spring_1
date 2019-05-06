package ru.geekbrains.java.Spring_1.xmlconfig;

public class WaitingRoomImpl implements IWaitingRoom {
    private int getCabinetNumber(){
        return 501;
    }

    public void servePatient(IPatient patient) {
        IMedicalCard medicalCard = new MedicalCardImpl();
        medicalCard.searchMedicalCard(patient);
        patient.setCabinetNumber(getCabinetNumber());
    }
}
