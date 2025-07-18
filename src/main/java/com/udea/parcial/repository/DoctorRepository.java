package com.udea.parcial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcial.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
  Optional<Doctor> findBySsn(String ssn);
}
