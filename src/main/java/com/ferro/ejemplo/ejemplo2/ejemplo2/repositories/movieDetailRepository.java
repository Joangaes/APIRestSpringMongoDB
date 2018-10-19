package com.ferro.ejemplo.ejemplo2.ejemplo2.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.movieDetail;

import java.util.List;
import java.util.Optional;


public interface movieDetailRepository extends MongoRepository<movieDetail, String>{
    @Override
    public Optional<movieDetail> findById(String id);
    @Override
    void delete(movieDetail deleted);
}