package com.example.jpahospital.service;

import com.example.jpahospital.Entities.Consultation;
import com.example.jpahospital.Entities.Medecin;
import com.example.jpahospital.Entities.Patient;
import com.example.jpahospital.Entities.RendezVous;

public interface IHospitalService {
 Patient savePatient(Patient patient) ;
 Medecin saveMedecin(Medecin medecin) ;
 RendezVous saveRDV(RendezVous rendezVous);
 Consultation saveConsultation(Consultation consultation) ;
}

