package br.com.san.edu;

public class PrintedBook extends Book{
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
