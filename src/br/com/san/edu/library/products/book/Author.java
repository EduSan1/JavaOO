package br.com.san.edu.library.products.book;

public class Author {
    private String name;
    private String email;
    private String cpf;

    public Author(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void getDetails() {
        System.out.println("Mostrando detalhes do Autor!");
        System.out.println("Nome: " + this.getName());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
    }
}
