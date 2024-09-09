package org.example;

import java.util.ArrayList;

public class Cinema {
    ArrayList<Movie> avaliebleMovies = new ArrayList<Movie>();
    ArrayList<Ticket> soldsTickets = new ArrayList<Ticket>();

    public Movie getMovie(String movieName){
        for(Integer i = 0; i < avaliebleMovies.size(); i++){
            Movie movie = avaliebleMovies.get(i);
            if (movie.name.equals(movieName)) {
                return movie;
            }
        }

        return null;
    }


}
