/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;
import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.movieDetailRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.movieDetail;
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
public class MovieDetailController {
    @Autowired
    movieDetailRepository movieDetailRepository;

    @RequestMapping(method=RequestMethod.GET, value="/movieDetails")
    public Iterable<movieDetail> movieDetails() {
        return movieDetailRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/movieDetails")
    public String save(@RequestBody movieDetail movieDet) {
        movieDetailRepository.save(movieDet);

        return movieDet.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/movieDetails/{id}")
    public movieDetail show(@PathVariable String id) {
        return movieDetailRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/movieDetails/{id}")
    public movieDetail update(@PathVariable String id, @RequestBody movieDetail movieDetail) {
        movieDetail movieDet = movieDetailRepository.findById(id).get();
        if(movieDetail.getActors() != null)
            movieDet.setActors(movieDetail.getActors());
        if(movieDetail.getAwards() != null)
            movieDet.setAwards(movieDetail.getAwards());
        if(movieDetail.getCountries() != null)
            movieDet.setCountries(movieDetail.getCountries());
        if(movieDetail.getDirector() != null)
            movieDet.setDirector(movieDetail.getDirector());
        if(movieDetail.getGenres() != null)
            movieDet.setGenres(movieDetail.getGenres());
        if(movieDetail.getImdb() != null)
            movieDet.setImdb(movieDetail.getImdb());
        if(movieDetail.getMetacritic() != null)
            movieDet.setMetacritic(movieDetail.getMetacritic());
        if(movieDetail.getPlot() != null)
            movieDet.setPlot(movieDetail.getPlot());
        if(movieDetail.getPoster() != null)
            movieDet.setPoster(movieDetail.getPoster());
        if(movieDetail.getRated() != null)
            movieDet.setRated(movieDetail.getRated());
        if(movieDetail.getReleased() != null)
            movieDet.setReleased(movieDetail.getReleased());
        if(movieDetail.getRuntime() != null)
            movieDet.setRuntime(movieDetail.getRuntime());
        if(movieDetail.getTomato() != null)
            movieDet.setTomato(movieDetail.getTomato());
        if(movieDetail.getType() != null)
            movieDet.setType(movieDetail.getType());
        if(movieDetail.getWriters() != null)
            movieDet.setWriters(movieDetail.getWriters());
        if(movieDetail.getYear() != null)
            movieDet.setYear(movieDetail.getYear());
        movieDetailRepository.save(movieDet);
        return movieDet;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/movieDetails/{id}")
    public String delete(@PathVariable String id) {
        movieDetail movieDet = movieDetailRepository.findById(id).get();
        movieDetailRepository.delete(movieDet);

        return "movieDetail deleted";
    }
}
