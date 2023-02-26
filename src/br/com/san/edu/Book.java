package br.com.san.edu;

public abstract class Book {
    private String name;
    private String description;
    private double value;
    private String isbn;
    private Author author;

    public Book(String name, double value, Author author) {
        setName(name);
        setValue(value);
        setAuthor(author);
        setIsbn("Ainda não possui um identificador");
        System.out.println("Novo livro \"" + this.getName() + "\" criado!");
        System.out.println("--------------------------------");
    }
    public Book(String name, double value, Author author, String isbn) {
        this(name, value, author);
        setIsbn(isbn);
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    void getDetails() {
        System.out.println("Mostrando detalhes do livro!");
        System.out.println("Nome: " + this.getName());
        System.out.println("Descrição: " + this.getDescription());
        System.out.println("Valor: R$" + this.getValue());
        System.out.println("ISBN: " + this.getIsbn());
        if (this.haveAuthor()) {
            System.out.println("-----");
            this.getAuthor().getDetails();
        }
        System.out.println("--------------------------------");
    }

    public abstract boolean  applyDiscount(double percentage);
    boolean haveAuthor() {
        boolean heHas = this.getAuthor() != null;
        return heHas;
    }
}
