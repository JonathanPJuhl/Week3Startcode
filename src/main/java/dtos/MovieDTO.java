/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;


public class MovieDTO {

    private int year;
    private String title;
    private String actors;


    public MovieDTO() {

    }

    public static List<MovieDTO> getDtos(List<Movie> rms){
        List<MovieDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new MovieDTO(rm)));
        return rmdtos;
    }


    public MovieDTO(Movie rm) {
        this.actors = rm.getActors();
        this.title = rm.getTitle();
        this.year = rm.getYear();
       
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }



  
    
    
    
    
    
    
}
