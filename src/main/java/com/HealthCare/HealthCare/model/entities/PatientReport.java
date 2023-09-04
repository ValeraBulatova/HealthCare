package com.HealthCare.HealthCare.model.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class PatientReport {

    private int id;
    private int patientId;
    private int doctorId;
    private LocalDate date;
    private LocalTime time;
    private String symptoms;
    private String diagnosis;
    private String prescription;
    private String transferDoctor;
}
