package com.uct.edu.so.backendfinalexam.controller;

import com.uct.edu.so.backendfinalexam.model.Hospital;
import com.uct.edu.so.backendfinalexam.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bookinghospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    //find all
    @GetMapping("/findall")
    public List<Hospital> findallAppointments() {
        return hospitalService.findallAppointments();
    }

    //find one
    @GetMapping("/findById/{id}")
    public Hospital findAppointmentById(@PathVariable int id) {
        return hospitalService.findAppointmentById(id);
    }

    //save all
    @PostMapping("/saveAll")
    public List<Hospital> saveAllAppointments(@RequestBody List<Hospital> hospitals) {
        return hospitalService.saveAllAppointments(hospitals);
    }

    //save one
    @PostMapping("/save")
    public Hospital saveAppointment(@RequestBody Hospital hospital) {
        return hospitalService.saveAppointment(hospital);
    }

    //update
    @PutMapping("/update/{id}")
    public Hospital updateAppointment(@PathVariable int id, @RequestBody Hospital hospital) {
        return hospitalService.updateAppointment(id, hospital);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public List<Hospital> deleteAppointment(@PathVariable int id) {
        return hospitalService.deleteAppointment(id);
    }
}