package training.book;

public class Book implements Comparable<Book> {

	private final String isbn;
	private final String title;

	public Book(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Book that) {
		return this.getIsbn().compareTo(that.getIsbn());
	}

}
