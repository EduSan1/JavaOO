package br.com.san.edu;

public class SalesRecord {

    public static void main(String[] args) {

        Author author = new Author("Rodrigo Turini");
        PrintedBook printedBook = new PrintedBook("Java", 59.90, author, "978-85-66250-46-6");
        Ebook ebook = new Ebook("Java", 59.90, author, "978-85-66250-46-6");
        ShoppingCart cart = new ShoppingCart();

        cart.add(printedBook);
        cart.add(ebook);

        System.out.println("Valor total da compra: " + cart.getTotal());
    }
}
