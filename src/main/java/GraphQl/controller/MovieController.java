package GraphQl.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import GraphQl.entities.Movie;
import GraphQl.services.MovieService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MovieController {

  private MovieService movieService;

  @MutationMapping("create")
  public Movie createMovie(@Argument("movie") MovieInput movie){
    Movie obj= new Movie();
    obj.setActor(movie.getActor());
    obj.setTitle(movie.getTitle());
    obj.setName(movie.getName());
    return movieService.createMovie(obj);
  }

  @MutationMapping("update")
  public Movie  updateMovies(@Argument Integer id, @Argument MovieInput input){
    Movie obj= new Movie();
    obj.setActor(input.getActor());
    obj.setName(input.getName());
    obj.setTitle(input.getTitle());
    return movieService.updateMovie(id,obj);
  }
  @MutationMapping("delete")
 public  void deleteMovie(Integer id){
    movieService.deleteMovie(id);
 }


    @QueryMapping("getMovies")
    public List<Movie> getAll(){
      return  movieService.getMovies();
    }

    @QueryMapping("getMovie")
    public Movie getMovie(@Argument("id") Integer id){
      return movieService.getMovie(id);
    }


    
}
