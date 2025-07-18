package com.udea.parcial.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historias_clinicas")
public class ClinicHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String chiefComplaint;
  private String diagnostic;
  private String treatment;
  private LocalDate date;
  @ManyToOne
  @JoinColumn(name = "paciente_id")
  private Pacient pacient;
  @ManyToOne
  @JoinColumn(name = "doctor_id")
  private Doctor doctor;
}
