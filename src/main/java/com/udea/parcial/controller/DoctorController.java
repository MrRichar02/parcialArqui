package com.udea.parcial.controller;

import com.udea.parcial.entity.Doctor;
import com.udea.parcial.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @MutationMapping
    public Doctor addDoctor(@Argument String name, @Argument String ssn, @Argument String speciality){
        return doctorService.createDoctor(name,ssn,speciality);
    }
}
