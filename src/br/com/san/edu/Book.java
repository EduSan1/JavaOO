package br.com.san.edu;

public class Book {
    String name;
    String description;
    double value;
    String isbn;
    Author author;

    public Book() {
        System.out.println("New book created!");
    }

    void getDetails() {
        System.out.println("Mostrando detalhes do livro!");
        System.out.println("Nome: " + this.name);
        System.out.println("Descrição: " + this.description);
        System.out.println("Valor: R$" + this.value);
        System.out.println("OSBN: " + this.isbn);
        if (this.haveAuthor())
            this.author.getDetails();
        System.out.println("--------------------------------");
    }

    void applyDiscount(double percentage) {
        value -= value * percentage;
    }
    boolean haveAuthor() {
     boolean heHas = this.author != null;
     return heHas;
    }
}
