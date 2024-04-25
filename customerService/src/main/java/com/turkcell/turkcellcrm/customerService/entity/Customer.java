package com.turkcell.turkcellcrm.customerService.entity;


import com.turkcell.turkcellcrm.customerService.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {
    private String email;
    private String mobilePhoneNumber;

    @OneToOne
    @JoinColumn(name = "individual_id", referencedColumnName = "id")
    private IndividualCustomer individualCustomer;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;
}
