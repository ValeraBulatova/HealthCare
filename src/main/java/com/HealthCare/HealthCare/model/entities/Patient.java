package com.HealthCare.HealthCare.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String gender;
    private String address;
    private String phone;
    private String email;

    public Patient(String name, String surname, String dob, String gender,
                   String address, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = LocalDate.parse(dob);
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.id = null;
    }

    public Patient() {

    }

    public void setId(Long id) {
        this.id = id;
    }

}
