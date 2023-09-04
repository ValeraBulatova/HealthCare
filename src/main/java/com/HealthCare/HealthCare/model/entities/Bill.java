package com.HealthCare.HealthCare.model.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bill {

    private int id;
    private int patientId;
    private int appointmentId;
    private LocalDate date;
    private LocalTime time;
    private String paymentMethod;
    private String expensesDescription;
    private double cost;
    private boolean status;

}
