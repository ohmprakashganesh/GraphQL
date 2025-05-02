package GraphQl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;




import GraphQl.entities.Book;
import GraphQl.services.BookService;



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

    @MutationMapping("createBook")
    public Book postBook(@Argument("book") BookInput input) {
        Book book1= new Book();
        book1.setAuthor(input.getAuthor());
        book1.setTitle(input.getTitle());
        book1.setPrice(input.getPrice());
        book1.setDesc(input.getDesc());
        book1.setPrice(input.getPrice());
        return bookService.create(book1);
    }

    
}
