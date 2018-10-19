package com.ferro.ejemplo.ejemplo2.ejemplo2.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "movieDetails")

/**
 *
 * @author Jose
 */

public class movieDetail {
   @Id
    String id;
    String[] actors;
    @DBRef Award awards;   
    String[] countries;
    String director;
    String[] genres;
    @DBRef Imdb imdb;
    Integer metacritic;
    String plot;
    String poster;
    String rated;
    Date released;
    Integer runtime;
    String title;
    @DBRef Tomato tomato;
    String type;
    String writers;
    Integer year;
    

     public movieDetail() {
    }
     
     public Tomato getTomato(){
         return tomato;
     }
     
     public void setTomato(Tomato tomato){
         this.tomato = tomato;
     }
     
     public Imdb getImdb(){
         return imdb;
     }
     
     public void setImdb(Imdb imdb){
         this.imdb = imdb;
     }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Date getReleased(){
        return released;
    }
    
    public void setReleased(Date released){
        this.released = released;
    }
    
    public Integer getYear(){
        return year;
    }
    
    public void setYear(Integer year){
        this.year = year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getWriters(){
        return writers;
    }
    
    public void setWriters(String writers){
        this.writers = writers;
    }
   
    
    public Integer getRuntime(){
        return runtime;
    }
    
    public void setRuntime(Integer runtime){
        this.runtime = runtime;
    }
    
    public String getPoster(){
        return poster;
    }
    
    public void setPoster(String poster){
        this.poster = poster;
    }
    
    public String getRated(){
        return rated;
    }
    
    public void setRated(String rated){
        this.rated = rated;
    }
    
    public Integer getMetacritic(){
        return metacritic;
    }
    
    public void setMetacritic(Integer metacritic){
        this.metacritic = metacritic;
    }
    
    public String getPlot(){
        return plot;
    }
    
    public void setPlot(String plot){
        this.plot = plot;
    }
    
    public String[] getActors(){
        return actors;
    }
    
    public void setActors(String[] actors){
        this.actors = actors;
    }
    
    public String[] getCountries(){
        return countries;
    }
    
    public void setCountries(String[] countries){
        this.countries = countries;
    }
    
    public String getDirector(){
        return director;
    }
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public String[] getGenres(){
        return genres;
    }
    
    public void setGenres(String[] genres){
        this.genres = genres;
    }
    
    public void setAwards(Award award){
        this.awards = award;
    }
    public Award getAwards(){
        return awards;
    }
    
    


 
}
