package com.HealthCare.HealthCare.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@Getter
@Entity
public class Patient {

    @jakarta.persistence.Id
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
    }

    public Patient() {
        this.name = "Name";
        this.surname = "Surname";
        this.dateOfBirth = LocalDate.now();
        this.gender = "Male";
        this.address = "Address";
        this.phone = "Phone";
        this.email = "Email";
    }

}
