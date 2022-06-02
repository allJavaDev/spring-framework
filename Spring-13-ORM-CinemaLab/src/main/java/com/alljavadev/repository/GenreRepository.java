package com.alljavadev.repository;

import com.alljavadev.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    List<Genre> findAllBy();

    // ------------------- Native QUERIES ------------------- //
    @Query("SELECT g FROM Genre g")
    List<Genre> fetchAll();

    //Write a native query that returns genres by containing name
    @Query(value = "SELECT * FROM genre WHERE name ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Genre> retrieveByName(@Param("name") String name);

}
