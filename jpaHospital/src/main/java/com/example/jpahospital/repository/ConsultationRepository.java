package com.example.jpahospital.repository;

import com.example.jpahospital.Entities.Consultation;
import com.example.jpahospital.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
