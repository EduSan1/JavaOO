package br.com.san.edu.library.products;

import br.com.san.edu.library.products.Product;

public class ShoppingCart {

    private double total;

    public void add(Product product) {
        System.out.println("Produto \""+ product.getName() +"\" Adicionado");
        setTotal(getTotal() + product.getValue());
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
