/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jose
 */
@Document
/**
 *
 * @author Jose
 */
public class Imdb {
    @Id
    String id;
    Double rating;
    Integer votes;
    
    public Imdb(){
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Double getRating(){
        return rating;
    }
    
    public void setRating(Double rating){
        this.rating = rating;
    }
    
    public Integer getVotes(){
        return votes;
    }
    
    public void setVotes(Integer votes){
        this.votes = votes;
    }
    
}
