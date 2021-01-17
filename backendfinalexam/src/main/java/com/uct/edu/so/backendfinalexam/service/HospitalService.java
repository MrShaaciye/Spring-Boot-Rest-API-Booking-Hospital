package com.uct.edu.so.backendfinalexam.service;

import com.uct.edu.so.backendfinalexam.model.Hospital;
import com.uct.edu.so.backendfinalexam.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    //find all
    public List<Hospital> findallAppointments() {
        return hospitalRepository.findAll();
    }

    //find one
    public Hospital findAppointmentById(int id) {
        return hospitalRepository.findById(id).orElse(null);
    }

    //save all
    public List<Hospital> saveAllAppointments(List<Hospital> hospitals) {
        return hospitalRepository.saveAll(hospitals);
    }

    //save one
    public Hospital saveAppointment(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    //update
    public Hospital updateAppointment(int id, Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    //delete
    public List<Hospital> deleteAppointment(int id) {
        hospitalRepository.deleteById(id);
        return hospitalRepository.findAll();
    }
}
