/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.MovieDTO;
import entities.Movie;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        MovieFacade fe = MovieFacade.getFacadeExample(emf);
        String[] actor = {"Peter","pan", "Robin", "Williams"};
        fe.addMovie(new MovieDTO(new Movie(1997, "Tarzan", actor)));
        fe.addMovie(new MovieDTO(new Movie(2000, "Ironman", actor)));
        //fe.addMovie(new MovieDTO(new Movie("First 3", "Last 3")));
        
    }
    
    public static void main(String[] args) {
        populate();
    }
}
