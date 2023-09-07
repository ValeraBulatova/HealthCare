package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {


    @GetMapping("/patients")
    public String showPatientView(Model m){

        m.addAttribute("Patient",
                new Patient("bob", "Marley", "2000-02-03", "male",
                        "address", "phone", "email"));

        return "patients";
    }
}
