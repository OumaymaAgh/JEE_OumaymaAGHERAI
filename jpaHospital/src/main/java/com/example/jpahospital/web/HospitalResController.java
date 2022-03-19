package com.example.jpahospital.web;

import com.example.jpahospital.Entities.Patient;
import com.example.jpahospital.repository.PatienRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class HospitalResController {
    @Autowired
    private PatienRepository patienRepository ;

    @GetMapping("/patients")
    public List<Patient> patiensList(){
        return  patienRepository.findAll();
    }
}
