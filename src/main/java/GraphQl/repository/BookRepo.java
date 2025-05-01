package GraphQl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GraphQl.entities.Book;

public interface BookRepo  extends  JpaRepository<Book, Long>{
    
}
