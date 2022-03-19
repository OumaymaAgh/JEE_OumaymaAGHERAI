package com.example.jpahospital.service;

import com.example.jpahospital.Entities.Consultation;
import com.example.jpahospital.Entities.Medecin;
import com.example.jpahospital.Entities.Patient;
import com.example.jpahospital.Entities.RendezVous;
import com.example.jpahospital.repository.ConsultationRepository;
import com.example.jpahospital.repository.MedecinRepository;
import com.example.jpahospital.repository.PatienRepository;
import com.example.jpahospital.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService { private PatienRepository patienRepository ;
  private MedecinRepository medecinRepository ;
  private RendezVousRepository rendezVousRepository ;
  private ConsultationRepository consultationRepository ;

    public HospitalServiceImpl(PatienRepository patienRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patienRepository = patienRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }
    @Override
    public Patient savePatient(Patient patient) {
        return patienRepository.save(patient);
    }
    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }
    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }
    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
