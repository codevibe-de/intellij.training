package training.book;

public interface BookRepository {

	void save(Book book);

	Book findById(String isbn);
	
}
