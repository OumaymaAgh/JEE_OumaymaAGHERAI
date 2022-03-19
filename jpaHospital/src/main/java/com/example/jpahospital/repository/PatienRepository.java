package com.example.jpahospital.repository;

import com.example.jpahospital.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatienRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String nom) ;
}
