package br.com.san.edu.library.products.book;

import br.com.san.edu.library.products.book.Author;
import br.com.san.edu.library.products.book.Book;

public class MiniBook extends Book {
    public MiniBook(String name, double value, Author author) {
        super(name, value, author);
    }

    public MiniBook(String name, double value, Author author, String isbn) {
        super(name, value, author, isbn);
    }

    @Override
    public boolean applyDiscount(double percentage) {
            return false;
    }
}
