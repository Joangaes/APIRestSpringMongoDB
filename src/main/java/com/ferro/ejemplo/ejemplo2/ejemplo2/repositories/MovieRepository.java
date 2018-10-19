package com.ferro.ejemplo.ejemplo2.ejemplo2.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Movie;

import java.util.List;
import java.util.Optional;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public interface MovieRepository extends MongoRepository<Movie, String>{
    @Override
    public Optional<Movie> findById(String id);
    @Override
    void delete(Movie deleted);
}
