package com.HealthCare.HealthCare.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

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

    public void setId(Long id) {
        this.id = id;
    }

}
