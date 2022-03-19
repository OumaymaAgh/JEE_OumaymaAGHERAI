package com.example.jpahospital.repository;

import com.example.jpahospital.Entities.Patient;
import com.example.jpahospital.Entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
