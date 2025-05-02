package GraphQl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GraphQl.entities.Movie;

public interface MovieRepo  extends JpaRepository<Movie, Integer>{
    
}
