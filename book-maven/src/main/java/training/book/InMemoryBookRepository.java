package training.book;

import java.util.HashMap;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {

	private Map<String, Book> booksMap = new HashMap<>();

	@Override
	public Book findById(String isbn) {
		return booksMap.get(isbn);
	}

	@Override
	public void save(Book book) {
		booksMap.put(book.getIsbn(), book);
	}

}
