package com.udea.parcial.controller;
import com.udea.parcial.entity.ClinicHistory;
import com.udea.parcial.service.ClinicHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import java.time.LocalDate;
@Controller
public class ClinicHistoryController {
    @Autowired
    private ClinicHistoryService clinicHistoryService;
    @MutationMapping
    public ClinicHistory createClinicHistory(@Argument String chiefComplaint,@Argument String diagnostic,@Argument String treatment,@Argument String date,@Argument Long pacientId,@Argument Long doctorId) {
        LocalDate parsedDate = LocalDate.parse(date);
        return clinicHistoryService.createClinicHistory(chiefComplaint, diagnostic, treatment, parsedDate, pacientId, doctorId);
    }
}