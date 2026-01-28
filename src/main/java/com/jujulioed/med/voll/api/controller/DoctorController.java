package com.jujulioed.med.voll.api.controller;

import com.jujulioed.med.voll.api.dto.DoctorRegistrationData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @PostMapping
    public void createDoctor(@RequestBody DoctorRegistrationData doctorRegistrationData) {
        

    }
}
