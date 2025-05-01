package GraphQl.service_impl;

import java.util.List;

import org.springframework.stereotype.Service;

import GraphQl.entities.Book;
import GraphQl.repository.BookRepo;
import GraphQl.services.BookService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookserviceImpl implements  BookService {

    private final BookRepo bookRepo;

    @Override
    public Book getBook(Long id) {
      return  bookRepo.findById(id).orElseThrow(()-> new RuntimeException("Book not exist with id "+id));
     }

    @Override
    public List<Book> getBooks() {
        return bookRepo.findAll();
  }

    @Override
    public Book create(Book book) {
       return bookRepo.save(book);
  }
    
}
