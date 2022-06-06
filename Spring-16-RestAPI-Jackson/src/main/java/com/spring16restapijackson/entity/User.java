package com.spring16restapijackson.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_account")
@JsonIgnoreProperties(value={"hibernateInitializer"}, ignoreUnknown=true)
public class User extends BaseEntity {
    //@JsonIgnore //dto to json, if we don't want to show
    private String email;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //we shouldn't see the password
    private String password;


    private String username;

    @OneToOne(fetch = FetchType.LAZY) //hibernate initializer is created, in order to ignore that fiels we have the jsoningore
    @JoinColumn(name = "account_details_id")
    @JsonManagedReference //is the forward part of the reference
    // - the one that gets serialized normally , we will see user info
    private Account account;

}
