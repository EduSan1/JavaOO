package br.com.san.edu;

public class Ebook extends Book implements Promotional{

    private String waterMark;
    public Ebook(String name, double value, Author author) {
        super(name, value, author);
    }
    public Ebook(String name, double value, Author author, String isbn) {
        super(name, value, author, isbn);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    @Override
    public boolean applyDiscount(double percentage) {
        if (percentage <= 0 || percentage > 0.15)
            return false;
        setValue(getValue() - getValue() * percentage);
        return true;
    }
}
