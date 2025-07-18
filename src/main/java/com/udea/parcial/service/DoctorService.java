package com.udea.parcial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.parcial.entity.Doctor;
import com.udea.parcial.repository.DoctorRepository;

@Service
public class DoctorService {

  @Autowired
  private DoctorRepository doctorRepository;

  public Doctor createDoctor(String name, String ssn, String speciality){
    Doctor doctor = new Doctor();
    doctor.setName(name);
    doctor.setSsn(ssn);
    doctor.setSpeciality(speciality);

    return doctorRepository.save(doctor);
  }
}
