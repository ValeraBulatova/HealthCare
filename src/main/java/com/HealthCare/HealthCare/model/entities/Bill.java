package com.HealthCare.HealthCare.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Getter
@Entity
public class Bill {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
