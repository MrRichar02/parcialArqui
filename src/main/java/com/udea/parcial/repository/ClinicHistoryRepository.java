package com.udea.parcial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcial.entity.ClinicHistory;

@Repository
public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory, Long> {
  List<ClinicHistory> findByPacientSsn(String ssn);
}
