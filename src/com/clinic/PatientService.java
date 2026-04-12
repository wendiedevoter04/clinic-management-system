package com.clinic;

import java.util.ArrayList;

public class PatientService {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                p.displayPatient();
            }
        }
    }

    public void searchPatientById(int id) {

        for (Patient p : patients) {
            if (p.getId() == id) {
                System.out.println("Patient found:");
                p.displayPatient();
                return;
            }
        }

        System.out.println("Patient not found.");
    }
}