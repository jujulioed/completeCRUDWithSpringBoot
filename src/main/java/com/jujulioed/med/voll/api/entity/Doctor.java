package com.jujulioed.med.voll.api.entity;

import com.jujulioed.med.voll.api.dto.DoctorRegistrationDataDTO;
import com.jujulioed.med.voll.api.enums.Specialty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "doctors")
@Entity(name= "Doctor")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorRegistrationDataDTO doctorRegistrationDataDTO) {
        this.name = doctorRegistrationDataDTO.name();
        this.email = doctorRegistrationDataDTO.email();
        this.crm = doctorRegistrationDataDTO.crm();
        this.specialty = doctorRegistrationDataDTO.specialty();
        this.address = new Address(doctorRegistrationDataDTO.address());
        this.phone = doctorRegistrationDataDTO.phone();
    }
}
