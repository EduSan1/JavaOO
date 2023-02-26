package br.com.san.edu;

public class DiscountRule {

    public static void main(String[] args) {
        Author author = new Author("Rodrigo Turini");
        PrintedBook book = new PrintedBook("Java", 59.90, author, "978-85-66250-46-6");
        Ebook ebook = new Ebook("Java", 59.90, author, "978-85-66250-46-6");
        Book miniBook = new MiniBook("Java", 59.90, author, "978-85-66250-46-6");

        if (book.applyDiscount(0.3))
            System.out.println("O valor do livro com desconto é: " + book.getValue());
        else
            System.out.println("Livros não podem ter mais de 30% de desconto");

        if (ebook.applyDiscount(0.15))
            System.out.println("O valor do livro digital com desconto é: " + ebook.getValue());
        else
            System.out.println("Livros digitais não podem ter mais de 15% de desconto");

        if (miniBook.applyDiscount(0.15))
            System.out.println("O valor do mini livro com desconto é: " + ebook.getValue());
        else
            System.out.println("Mini livros não podem ter desconto");
    }
}
