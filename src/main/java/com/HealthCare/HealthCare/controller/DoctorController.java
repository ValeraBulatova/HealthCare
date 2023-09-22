package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Doctor;
import com.HealthCare.HealthCare.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public String getAllDoctors(Model m) {
        m.addAttribute("Doctor", doctorService.getAllDoctors());
        return "/doctors/list";
    }

    @GetMapping("/select")
    public String getDoctor(@RequestParam Long id, Model m) {
        m.addAttribute("Doctor", doctorService.getDoctor(id));
        return "/doctors/select";
    }

    @PostMapping("/add/confirm")
    public String addDoctor(Doctor doctor) {
        doctorService.addDoctor(doctor);
        return "redirect:/doctors";
    }

    @DeleteMapping("/delete")
    public String deleteDoctor(@RequestParam Long id) {
        doctorService.deleteDoctor(id);
        return "redirect:/doctors";
    }
}
