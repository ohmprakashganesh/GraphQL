package GraphQl.service_impl;

import java.util.List;

import GraphQl.entities.Movie;
import GraphQl.repository.MovieRepo;
import GraphQl.services.MovieService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MovieServiceImpl implements  MovieService {

    private final MovieRepo movieRepo;

    @Override
    public Movie getMovie(Integer id) {
        return movieRepo.findById(id).orElseThrow(()-> new RuntimeException("movie not found with id "+id));
       }

    @Override
    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
      return  movieRepo.save(movie);
        
    }

    @Override
    public Movie updateMovie(Integer id, Movie movie) {
        Movie updated= movieRepo.findById(id).orElseThrow(()-> new RuntimeException("movie not found with id "+id));
        updated.setActor(movie.getActor());
        updated.setName(movie.getName());
        updated.setTitle(movie.getTitle());
      return  movieRepo.save(updated);

    
      }

    @Override
    public void deleteMovie(Integer id) {
        movieRepo.deleteById(id);
     }
    
}
