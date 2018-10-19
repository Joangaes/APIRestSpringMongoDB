/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;
import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.MovieRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose
 */
@RestController
public class MovieController {
    
     @Autowired
    MovieRepository movieRepository;
     
     @RequestMapping(method=RequestMethod.GET, value="/movies")
    public Iterable<Movie> product() {
        return movieRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/movies")
    public String save(@RequestBody Movie product) {
        movieRepository.save(product);

        return product.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/movies/{id}")
    public Movie show(@PathVariable String id) {
        return movieRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/movies/{id}")
    public Movie update(@PathVariable String id, @RequestBody Movie movie) {
        Movie mov_db = movieRepository.findById(id).get();
        if(movie.getImdb() != null)
            mov_db.setImdb(movie.getImdb());
        if(movie.getTitle() != null)
            mov_db.setTitle(movie.getTitle());
        if(movie.getType() != null)
            mov_db.setType(movie.getType());
        if(movie.getYear() != null)
            mov_db.setYear(movie.getYear());
        movieRepository.save(mov_db);
        return mov_db;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
    public String delete(@PathVariable String id) {
        Movie product = movieRepository.findById(id).get();
        movieRepository.delete(product);

        return "product deleted";
    }
    
}
