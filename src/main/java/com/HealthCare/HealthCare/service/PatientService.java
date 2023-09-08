package com.HealthCare.HealthCare.service;

import com.HealthCare.HealthCare.model.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient getPatient(Long id) {
        return patientRepository.findById(id);
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public String createPatient(Patient patient) {
        patientRepository.save(patient);
        return String.format("Patient %s %s with id: %d is created successfully",
                patient.getName(), patient.getSurname(), patient.getId());
    }
    public String updatePatient(Patient patient) {
        Patient updatedPatient = patientRepository.findById(patient.getId());
        if (updatedPatient == null) {
//            TODO : uncomment row with exception, implement try/catch in controller for this exception
//            throw new NoSuchFieldException(String.format("Patient with id %d was not found in database", patient.getId()));
        }
        updatedPatient.setName(patient.getName());
        updatedPatient.setSurname(patient.getSurname());
        updatedPatient.setAddress(patient.getAddress());
        updatedPatient.setEmail(patient.getEmail());
        updatedPatient.setPhone(patient.getPhone());
        updatedPatient.setGender(patient.getGender());

        patientRepository.save(updatedPatient);

        return String.format("Patient %s %s with id %d was updated successfully", patient.getName(), patient.getSurname(), patient.getId());
    }
    public String deletePatient(Long id) {
        Patient patient = patientRepository.findById(id);
        if (patient == null) {
//            TODO : uncomment row with exception, implement try/catch in controller for this exception
//            throw new NoSuchFieldException(String.format("Patient with id %d was not found in database", patient.getId()));
        }
        patientRepository.delete(patient);

        return String.format("Patient %s %s with id %d was deleted successfully", patient.getName(), patient.getSurname(), id);
    }
}
