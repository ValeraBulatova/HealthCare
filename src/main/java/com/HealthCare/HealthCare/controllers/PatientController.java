//package com.HealthCare.HealthCare.controllers;
//
//import com.HealthCare.HealthCare.model.entities.Patient;
//import org.hibernate.mapping.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
////@Controller(value = "patientController")
//public class PatientController {
//
//    @Autowired
//    PatientS p1;
//
//    @PostMapping(value = "registerPatient", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public void registerPatient(Patient p){
//        p1.save(p);
//    }
//
//    @DeleteMapping(value = "deletePatient", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public void deletePatient(Patient p){
//        p1.deleteById(p.getId());
//    }
//
//    @GetMapping(value = "getPatient", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public Patient getPatient(int id){
//        return p1.findByID(id);
//    }
//
//    @GetMapping(value = "getPatients", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Patient> getPatients(){
//        return p1.findAll();
//    }
//
//
//
//}
