package com.alljavadev.entity;

import com.alljavadev.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="account_details")
public class Account extends BaseEntity{

    @OneToOne(mappedBy = "account")
    private User user;

    private String name;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String address;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", postalCode='" + postalCode + '\'' +
                ", role=" + role +
                ", user=" + user +
                '}';
    }
}
