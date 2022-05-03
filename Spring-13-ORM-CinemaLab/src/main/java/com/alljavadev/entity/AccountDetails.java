package com.alljavadev.entity;

import com.alljavadev.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity{

    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;

    private String name;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String address;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private Role role;


}
