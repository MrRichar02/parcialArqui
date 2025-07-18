package com.udea.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.udea.parcial.entity.ClinicHistory;
import com.udea.parcial.entity.Pacient;
import com.udea.parcial.service.PacientService;


@Controller
public class PacientController {

  @Autowired
  private PacientService pacientService;

  @MutationMapping
  public Pacient addPacient(@Argument String name, @Argument String lastName, @Argument String ssn, @Argument Integer age, @Argument String gender){
    return pacientService.createPacient(name, lastName, ssn, age, gender);
  }

  @QueryMapping
  public List<ClinicHistory> getHistories(@Argument String ssn){
    return pacientService.getHistoryBySsn(ssn);
  }

}
