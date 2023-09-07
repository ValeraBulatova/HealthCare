package com.HealthCare.HealthCare.service;

import com.HealthCare.HealthCare.model.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

    Patient findById(Long id);
}
