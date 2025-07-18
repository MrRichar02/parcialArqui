package com.udea.parcial.service;

import java.time.LocalDate;

import com.udea.parcial.entity.Doctor;
import com.udea.parcial.entity.Pacient;
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

  public ClinicHistory createClinicHistory(String chiefComplaint, String diagnostic, String treatment, LocalDate date, Long pacientId, Long doctorId) {
    Pacient pacient = pacientRepository.findById(pacientId)
            .orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
    Doctor doctor = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new RuntimeException("Doctor no encontrado"));

    ClinicHistory clinicHistory = new ClinicHistory();
    clinicHistory.setChiefComplaint(chiefComplaint);
    clinicHistory.setDiagnostic(diagnostic);
    clinicHistory.setTreatment(treatment);
    clinicHistory.setDate(date);
    clinicHistory.setPacient(pacient);
    clinicHistory.setDoctor(doctor);

    return clinicHistoryRepository.save(clinicHistory);
  }
}

