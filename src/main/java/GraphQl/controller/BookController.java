package GraphQl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GraphQl.entities.Book;
import GraphQl.services.BookService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// @RestController
// @AllArgsConstructor
// @RequestMapping("/book")

@Controller
public class BookController {

    @Autowired
    private  BookService bookService;

    // @GetMapping("/{id}")
    @QueryMapping("getBook")
    public Book getbook(@Argument Long bookId){
        System.out.print("called contrller ");
        return bookService.getBook(bookId);
        // return new ResponseEntity(bookService.getBook(id),HttpStatus.ACCEPTED);
        
    }

    // @GetMapping("/all")

    // @SchemaMapping  
    // mutation,querying,subscriptio

    @QueryMapping("allBooks")
    public List< Book> getBooks(){
     return bookService.getBooks();
        // return new ResponseEntity(bookService.getBook(id),HttpStatus.ACCEPTED);
        
    }

    @PostMapping
    public ResponseEntity<Book> postBook(@RequestBody Book entity) {
        return new ResponseEntity<>(bookService.create(entity), HttpStatus.CREATED);
    }
    

    
}
