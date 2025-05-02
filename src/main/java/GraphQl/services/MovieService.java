package GraphQl.services;

import java.util.List;

import GraphQl.entities.Movie;

public interface MovieService {

    Movie getMovie(Integer id);
    List<Movie> getMovies();

    Movie createMovie(Movie movie);

    Movie updateMovie(Integer id, Movie movie);
    
    void deleteMovie(Integer id);

    
    
}
