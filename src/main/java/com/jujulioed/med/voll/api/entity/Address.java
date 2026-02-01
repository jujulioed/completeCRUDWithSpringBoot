package com.jujulioed.med.voll.api.entity;

import com.jujulioed.med.voll.api.dto.AddresDataDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Address {

    private String street;
    private String neighborhood;
    private String zipCode;
    private String city;
    private String uf;
    private String number;
    private String complement;

    public Address(AddresDataDTO address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.zipCode = address.zipCode();
        this.city = address.city();
        this.uf = address.uf();
        this.number = address.number();
        this.complement = address.complement();
    }

    public void updateAddressData(AddresDataDTO address) {
        if (address.street() != null) {
            this.street = address.street();
        }

        if (address.neighborhood() != null) {
            this.neighborhood = address.neighborhood();
        }

        if (address.zipCode() != null) {
            this.zipCode = address.zipCode();
        }

        if (address.city() != null) {
            this.city = address.city();
        }

        if (address.uf() != null) {
            this.uf = address.uf();
        }

        if (address.number() != null) {
            this.number = address.number();
        }

        if (address.complement() != null) {
            this.complement = address.complement();
        }
    }
}
