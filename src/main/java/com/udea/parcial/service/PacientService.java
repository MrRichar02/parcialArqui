package com.udea.parcial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.parcial.entity.ClinicHistory;
import com.udea.parcial.entity.Pacient;
import com.udea.parcial.repository.ClinicHistoryRepository;
import com.udea.parcial.repository.DoctorRepository;
import com.udea.parcial.repository.PacientRepository;

@Service
public class PacientService {

  @Autowired
  private ClinicHistoryRepository clinicHistoryRepository;

  @Autowired
  private PacientRepository pacientRepository;
  
  @Autowired
  private DoctorRepository doctorRepository;


  public Pacient createPacient(String name, String lastName, String ssn, Integer age, String gender){

    Pacient pacient = new Pacient();
    pacient.setName(name);
    pacient.setLastName(lastName);
    pacient.setSsn(ssn);
    pacient.setAge(age);
    pacient.setGender(gender);

    return pacientRepository.save(pacient);

  }

  public List<ClinicHistory> getHistoryBySsn(String ssn){
    return clinicHistoryRepository.findBySsnPacient(ssn);
  }

}
