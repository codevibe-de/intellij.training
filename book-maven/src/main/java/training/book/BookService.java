package training.book;

public class BookService {
	
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book addBook(String isbn, String title, String author, int pageCount) {
		Book book = new Book(isbn);
		this.bookRepository.save(book);
		return book;
	}

	public void removeBook(String string) {
		// TODO Auto-generated method stub
	}
	
}
