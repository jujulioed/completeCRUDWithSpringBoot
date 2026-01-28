package com.jujulioed.med.voll.api.dto;

import com.jujulioed.med.voll.api.enums.Specialty;

public record DoctorRegistrationData(String name, String email, String crm, Specialty specialty, AddresData addresData) {
}
