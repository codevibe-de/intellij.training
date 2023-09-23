package de.codevibe.book;

public class LibraryApp {
    public static void main(String[] args) {
        var book = new InMemoryBookRepository().findByIsbn("123-456");
    }
}
