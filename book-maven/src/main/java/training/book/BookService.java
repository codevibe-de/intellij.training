package training.book;

public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book addBook(String isbn, String title, String author, int pageCount) {
		Book book = new Book(isbn, title);
		this.bookRepository.save(book);
		return book;
	}

	public void removeBook(String string) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}

	public Book getBook(String isbn) {
		return bookRepository.findById(isbn);
	}

}
