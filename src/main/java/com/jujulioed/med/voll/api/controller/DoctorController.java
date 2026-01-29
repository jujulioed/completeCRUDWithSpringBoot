package com.jujulioed.med.voll.api.controller;

import com.jujulioed.med.voll.api.dto.DoctorRegistrationDataDTO;
import com.jujulioed.med.voll.api.entity.Doctor;
import com.jujulioed.med.voll.api.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void createDoctor(@RequestBody @Valid DoctorRegistrationDataDTO doctorRegistrationDataDTO) {
        repository.save(new Doctor(doctorRegistrationDataDTO));
    }
}
