package com.uct.edu.so.backendfinalexam.repository;

import com.uct.edu.so.backendfinalexam.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}