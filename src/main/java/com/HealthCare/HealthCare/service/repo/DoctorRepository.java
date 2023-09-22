package com.HealthCare.HealthCare.service.repo;

import com.HealthCare.HealthCare.model.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

    Doctor findById(Long id);
}
