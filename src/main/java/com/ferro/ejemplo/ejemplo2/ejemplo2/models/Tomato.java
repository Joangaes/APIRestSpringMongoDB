/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jose
 */
@Document
public class Tomato {
    
     String consensus;
     Integer fresh;
     String image;
     Integer meter;
     Integer rating;
     Integer reviews;
     Integer userMeter;
     Integer userRating;
     Integer userReviews;
    public Tomato(){
        
    }
    
    public Integer getUserMeter(){
        return userMeter;
    }
    
    public void setUserMeter(Integer userMeter){
        this.userMeter = userMeter;
    }
    
    public Integer getUserRating(){
        return userRating;
    }
    
    public void setUserRating(Integer userRating){
        this.userRating = userRating;
    }
    
    public Integer getUserReviews(){
        return userReviews;
    }
    
    public void setUserReviews(){
        this.userReviews = userReviews;
    }
    
    public Integer getMeter(){
        return meter;
    }
    
    public void setMeter(Integer meter){
        this.meter = meter;
    }
    
    public Integer getRating(){
        return rating;
    }
    
    public void setRating(Integer rating){
        this.rating = rating;
    }
    
    public Integer getReviews(){
        return reviews;
    }
    
    public void setReviews(Integer reviews){
        this.reviews = reviews;
    }
    
    public String getConsensus(){
        return consensus;
    }
    
    public void setConsensus(String consensus){
        this.consensus = consensus;
    }
    
    public Integer getFresh(){
        return fresh;
    }
    
    public void setFresh(Integer fresh){
        this.fresh = fresh;
    }
    
    public String getImage(){
        return image;
    }
    
    public void setImage(String image){
        this.image = image;
    }
    
    
    
    
}
