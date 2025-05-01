package GraphQl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import GraphQl.entities.Book;
import GraphQl.services.BookService;

@SpringBootApplication
public class GraphQlApplication implements  CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
	// 	Book book =  new Book();
	// 	book.setAuthor("om prakash");
	// 	book.setTitle("hero no one ");	
	// 	book.setPrice(222);
	// 	book.setDesc("kuch v likho ");
		
	// 	Book book1 =  new Book();
	// 	book1.setAuthor("om prakash");
	// 	book1.setTitle("hero no one ");	
	// 	book1.setPrice(878);
	// 	book1.setDesc("kuch v likho ");

	// 	Book book2 =  new Book();
	// 	book2.setAuthor(" prakash");
	// 	book2.setTitle("hero no one ");	
	// 	book2.setPrice(6);
	// 	book2.setDesc("kuch v likho ");

	// this.bookService.create(book);
	// this.bookService.create(book1);
	// this.bookService.create(book2);


	}

}
