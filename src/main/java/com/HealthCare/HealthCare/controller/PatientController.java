package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Patient;
import com.HealthCare.HealthCare.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public String showPatientView(Model m){
        // Add the list of patients to the model
        m.addAttribute("Patient", patientService.getPatients());

        return "patients";
    }

    @PostMapping("/patients/add")
    public String addPatient(Patient patient) {
        // Save the new patient to the database
        patientService.createPatient(patient);

        return "redirect:/patients"; // Redirect back to the patient list
    }

    @PostMapping("/patients/delete")
    public String deletePatient(@RequestParam Long id) {
        patientService.deletePatient(id);

        return "redirect:/patients"; // Redirect back to the patient list
    }

}
