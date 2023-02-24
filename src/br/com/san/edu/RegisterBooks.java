package br.com.san.edu;

public class RegisterBooks {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "Rodrigo Turini";
        author.email = "rodrigo.turini@caelum.com.br";
        author.cpf = "123.456.789-10";

        Book book = new Book();
        book.name = "Java";
        book.description = "Desbravando Java e Orientação a Objeto";
        book.value = 59.90;
        book.isbn = "978-85-66250-46-6";
        book.author = author;

        Author authorTwo = new Author();
        authorTwo.name = "Eduardo Felipe Zambom Santana";
        authorTwo.email = "eduardo.felipe@caelum.com.br";
        authorTwo.cpf = "123.654.178-19";

        Book bookTwo = new Book();
        bookTwo.name = "Back-end Java";
        bookTwo.description = "Microsserviços, Spring Boot e Kubernetes";
        bookTwo.value = 79.90;
        bookTwo.isbn = "432-76-4569-54-2";
        bookTwo.author = authorTwo;

        book.getDetails();

        bookTwo.getDetails();

    }
}
