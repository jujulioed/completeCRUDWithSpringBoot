package com.jujulioed.med.voll.api.dto;

import com.jujulioed.med.voll.api.entity.Doctor;
import com.jujulioed.med.voll.api.enums.Specialty;

public record ListDataDoctorsDTO(
        String name,
        String email,
        String crm,
        Specialty specialty
) {

    public ListDataDoctorsDTO(Doctor doctor)
    {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }}
