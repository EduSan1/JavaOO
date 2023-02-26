package br.com.san.edu.library.products.book;

import br.com.san.edu.library.products.Promotional;
import br.com.san.edu.library.products.book.Author;
import br.com.san.edu.library.products.book.Book;

public class PrintedBook extends Book implements Promotional {
    public PrintedBook(String name, double value, Author author) {
        super(name, value, author);
    }

    public PrintedBook(String name, double value, Author author, String isbn) {
        super(name, value, author, isbn);
    }

    public double getPrintRate() {
        return super.getValue() * 0.05;
    }

    @Override
    public boolean applyDiscount(double percentage) {
        if (percentage <= 0 || percentage > 0.3)
            return false;
        setValue(getValue() - getValue() * percentage);
        return true;
    }
}
