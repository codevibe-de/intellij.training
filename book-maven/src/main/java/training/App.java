package training;

import training.book.BookService;
import training.book.InMemoryBookRepository;
import utils.IsbnGenerator;

public class App {

	public static void main(String[] args) {
		BookService bookService = new BookService(new InMemoryBookRepository());
		IsbnGenerator isbnGenerator = new IsbnGenerator();
		bookService.addBook(isbnGenerator.next(), "The Hobbit", "J.R.R. Tolkien", 283);
		
		bookService.removeBook("3333-444");
	}

}
