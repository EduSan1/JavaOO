package br.com.san.edu.library.products.magazine;

import br.com.san.edu.library.products.Product;
import br.com.san.edu.library.products.Promotional;
import br.com.san.edu.library.products.magazine.Publisher;

public class Magazine implements Product, Promotional {
    private String name;
    private String description;
    private double value;
    private Publisher publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean applyDiscount(double percentage) {
        if (percentage <= 0 || percentage > 0.3)
            return false;
        setValue(getValue() - getValue() * percentage);
        return true;
    }
}
