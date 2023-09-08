package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {


    @GetMapping("/patients")
    public String showPatientView(Model m){

        m.addAttribute("Patient",
                new Patient("bob", "Marley", "2000-02-03", "male",
                        "address", "phone", "email"));

        return "patients";
    }

    @PostMapping("/patients/add")
    public String addPatient(Patient patient) {
        // Save the new patient to the database
        //patientRepository.save(patient);
        System.out.println(patient.getId());
        return "redirect:/patients"; // Redirect back to the patient list
    }
}
