package com.alljavadev.repository;

import com.alljavadev.entity.Account;
import com.alljavadev.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeIsLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findAllByRole(Role role);

    //Write a derived query to list all accounts between a range of ages
    List<Account> findAllByAgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findByAddressStartingWith(String pattern);

    //Write a derived query to sort the list of accounts with age
    List<Account> findByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts

    @Query("SELECT a FROM Account a")
    List<Account> getAccounts();

    //Write a JPQL query to list all admin accounts

    @Query("SELECT a FROM Account a where a.role ='ADMIN'")
    List<Account> getAdminAccounts();

    //Write a JPQL query to sort all accounts with age

    @Query("SELECT a FROM Account a order by a.age desc ")
    List<Account> sortAccountsByAge();

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "SELECT * FROM accountDetails WHERE age< ?1",nativeQuery = true)
    List<Account> retrieveAllByAgeLowerThan(@Param("age") Integer age);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    //@Query(value = "SELECT * FROM accountDetails WHERE name like '?1' or address like '?1' or country like '?1' or state like '?1', city like '?1'",nativeQuery = true)

    @Query(value = "SELECT * FROM account_details WHERE name ILIKE concat('%', ?1, '%') " +
            "OR country ILIKE concat('%', ?1, '%') " +
            "OR address ILIKE concat('%', ?1, '%') " +
            "OR state ILIKE concat('%', ?1, '%') " +
            "OR city ILIKE concat('%', ?1, '%') ", nativeQuery = true)
    List<Account> retrieveAccountsContaining(String pattern);

    //Write a native query to read all accounts with an age higher than a specific value
    @Query(value = "SELECT * FROM account_details WHERE age > ?1", nativeQuery = true)
    List<Account> retrieveHigherThanAge(@Param("age") Integer age);


}
