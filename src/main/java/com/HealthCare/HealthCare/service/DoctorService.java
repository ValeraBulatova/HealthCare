package com.HealthCare.HealthCare.service;

import com.HealthCare.HealthCare.model.entities.Doctor;
import com.HealthCare.HealthCare.service.repo.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctor(Long id) {
        return doctorRepository.findById(id);
    }

    public String addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return String.format("Doctor %s %s %s with id: %d is created successfully",
                doctor.getName(), doctor.getSurname(), doctor.getSpecialisation(), doctor.getId());
    }

    public String deleteDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id);
        doctorRepository.delete(doctor);
        return String.format("Doctor %s %s %s with id %d was deleted successfully",
                doctor.getName(), doctor.getSurname(), doctor.getSpecialisation(), id);
    }
}
