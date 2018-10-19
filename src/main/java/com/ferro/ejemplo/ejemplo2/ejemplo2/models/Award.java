package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jose
 */
@Document
public class Award {
    Integer nominations;
    String text;
    Integer wins;    
   
    public Award(){
        
    }
    
    public Integer getNominations(){
        return nominations;
    }
    public void setNominations(Integer nominations){
        this.nominations = nominations;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public Integer getWins(){
        return wins;
    }
    
    public void setWins(Integer wins){
        this.wins = wins;
    }
}
