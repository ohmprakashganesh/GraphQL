package GraphQl.services;

import java.util.List;

import GraphQl.entities.Book;

public interface BookService {
    Book getBook(Long id);
    List<Book> getBooks();
    Book create(Book book);
    
}
