package br.com.san.edu.library.test;

import br.com.san.edu.library.products.book.Author;
import br.com.san.edu.library.products.book.PrintedBook;

public class RegisterBooks {
    public static void main(String[] args) {
        Author author = new Author("Rodrigo Turini");
        author.setEmail("rodrigo.turini@caelum.com.br");
        author.setCpf("123.456.789-10");

        PrintedBook book = new PrintedBook("Java", 59.90, author, "978-85-66250-46-6");
        book.setDescription("Desbravando Java e Orientação a Objeto");

        Author authorTwo = new Author("Eduardo Felipe Zambom Santana");
        authorTwo.setEmail("eduardo.felipe@caelum.com.br");
        authorTwo.setCpf("123.456.789-10");

        PrintedBook bookTwo = new PrintedBook("Back-end Java", 79.90, authorTwo);
        bookTwo.setDescription("Microsserviços, Spring Boot e Kubernetes");

        book.getDetails();

        bookTwo.getDetails();

    }
}
