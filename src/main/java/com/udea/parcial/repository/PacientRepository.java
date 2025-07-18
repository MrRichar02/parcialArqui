package com.udea.parcial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcial.entity.Pacient;

@Repository
public interface PacientRepository extends JpaRepository<Pacient, Long> {
  Optional<Pacient> findBySsn(String ssn);
}
