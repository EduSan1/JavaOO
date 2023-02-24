package br.com.san.edu;

public class Author {
    String name;
    String email;
    String cpf;

    void getDetails() {
        System.out.println("Mostrando detalhes do Autor!");
        System.out.println("Nome: " + this.name);
        System.out.println("E-mail: " + this.email);
        System.out.println("CPF: " + this.cpf);
    }
}
