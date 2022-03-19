package com.example.jpahospital.repository;

import com.example.jpahospital.Entities.Medecin;
import com.example.jpahospital.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom) ;
}
