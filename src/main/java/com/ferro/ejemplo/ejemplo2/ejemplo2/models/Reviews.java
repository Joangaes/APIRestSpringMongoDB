package com.ferro.ejemplo.ejemplo2.ejemplo2.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "reviews")

/**
 *
 * @author Jose
 */
public class Reviews {
    @Id
    String id;
    Date date;
    Double rating;
    
    String reviewer;
    String text;

     public Reviews() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public Double getRating(){
        return rating;
    }
    
    public void setRating(Double rating){
        this.rating = rating;
    }
    
    public String getReviewer(){
        return reviewer;
    }
    
    public void setReviewer(String reviewer){
        this.reviewer = reviewer;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }



}


