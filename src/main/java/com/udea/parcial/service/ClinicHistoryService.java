package com.udea.parcial.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.parcial.entity.ClinicHistory;
import com.udea.parcial.repository.ClinicHistoryRepository;
import com.udea.parcial.repository.DoctorRepository;
import com.udea.parcial.repository.PacientRepository;

@Service
public class ClinicHistoryService {

  @Autowired
  ClinicHistoryRepository clinicHistoryRepository;

  @Autowired
  PacientRepository pacientRepository;

  @Autowired
  DoctorRepository doctorRepository;

  public ClinicHistory createClinicHystory(String chiefComplaint, String diagnostic, String treatment, LocalDate date, Long paciente_id, Long doctor_id){
    ClinicHistory clinicHistory = new ClinicHistory();
    clinicHistory.setChiefComplaint(chiefComplaint);
    clinicHistory.setDiagnostic(diagnostic);
    clinicHistory.setTreatment(treatment);
    clinicHistory.setDate(date);
    clinicHistory.setPaciente_id(pacientRepository.findById(paciente_id));
    clinicHistory.setdoctor_id(doctorRepository.findById(paciente_id));
  }

}
