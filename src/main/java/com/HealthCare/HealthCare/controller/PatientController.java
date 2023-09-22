package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Patient;
import com.HealthCare.HealthCare.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // the default page for /patients is the list of patients
    @GetMapping
    public String showPatientsView(Model m){
        // Add the list of patients to the model
        m.addAttribute("Patient", patientService.getPatients());

        return "/patients/list";
    }

    @GetMapping("/add")
    public String showAddPatientView(){
        //m.addAttribute("Patient", new Patient());

        return "/patients/add";
    }

    @PostMapping("/add/confirm")
    public String addPatient(Patient patient) {
        // Save the new patient to the database
        patientService.createPatient(patient);

        return "redirect:/patients"; // Redirect back to the patient list
    }

    @PostMapping("/delete")
    public String deletePatient(@RequestParam Long id) {
        patientService.deletePatient(id);

        return "redirect:/patients"; // Redirect back to the patient list
    }

    @GetMapping("/update")
    public String showUpdatePatientForm(@RequestParam Long id, Model model) {
        // Retrieve the patient information by ID from your database or service
        Patient patient = patientService.getPatient(id);

        // Add the patient object to the model
        model.addAttribute("patient", patient);

        // Return the name of the HTML template
        return "patients/update"; // The name of your HTML template for updating patients
    }

    @PostMapping("/update")
    public String updatePatient(@ModelAttribute("patient") Patient updatedPatient) {
        patientService.updatePatient(updatedPatient);

        return "redirect:/patients"; // Redirect to the patient list page
    }
}
