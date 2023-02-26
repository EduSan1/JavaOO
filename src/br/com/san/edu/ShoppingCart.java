package br.com.san.edu;

public class ShoppingCart {

    private double total;

    public void add(Book book) {
        System.out.println("Livro \""+ book.getName() +"\" Adicionado");
        book.applyDiscount(0.05);
        setTotal(getTotal() + book.getValue());
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
