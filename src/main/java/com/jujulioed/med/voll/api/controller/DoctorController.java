package com.jujulioed.med.voll.api.controller;

import com.jujulioed.med.voll.api.dto.DoctorRegistrationDataDTO;
import com.jujulioed.med.voll.api.dto.ListDataDoctorsDTO;
import com.jujulioed.med.voll.api.entity.Doctor;
import com.jujulioed.med.voll.api.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<ListDataDoctorsDTO> listDoctor(@PageableDefault(size = 10, sort= {"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(ListDataDoctorsDTO::new);
    }
}
