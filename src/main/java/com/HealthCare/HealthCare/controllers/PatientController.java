package com.HealthCare.HealthCare.controllers;

import com.HealthCare.HealthCare.model.entities.Patient;
import com.HealthCare.HealthCare.service.PatientService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "patientController")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping(value = "registerPatient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void registerPatient(Patient p){
        patientService.createPatient(p);
    }

    @DeleteMapping(value = "deletePatient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePatient(Patient p){
        patientService.deletePatient(p.getId());
    }

    @GetMapping(value = "getPatient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPatient(Model model, Long id){
        model.addAttribute("patient",patientService.getPatient(id));
        return "patient";
    }

    @GetMapping(value = "getPatients", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPatient(Model model, Long id){
        model.addAttribute("patients",patientService.getPatients());
        return "patients";
    }



}
