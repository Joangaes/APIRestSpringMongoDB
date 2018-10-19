/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
/**
 *
 * @author Jose
 */
public class Movie {
    @Id
    String id;
    String title;
    Integer year;
    String imdb;
    String type;

    public Movie() {
    }

    public Movie(String movTitle, Integer movYear, String movImdb, String movType) //Constructor para crear el modelo perse
    {
        this.title = movTitle;
        this.year = movYear;
        this.imdb = movImdb;
        this.type = movType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public Integer getYear(){
        return year;
    }
    
    public void setYear(Integer year){
        this.year = year;
    }
    
    public String getImdb(){
        return imdb;
    }
    
    public void setImdb(String imdb){
        this.imdb = imdb;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
}
