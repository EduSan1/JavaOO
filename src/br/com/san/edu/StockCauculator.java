package br.com.san.edu;

public class StockCauculator {
    public static void main(String[] args) {
        double soma = 0;

        for(double index = 0; index < 1; index++) {
            soma += 59.9;
        }

        if (soma < 150 )
            System.out.println("Seu estoque está muito baixo");
        else if (soma >= 2000)
            System.out.println("Seu estoque está muito alto");
        else
            System.out.println("Seu estoque está normal");

        System.out.println("Valor do estoque: " + soma);
    }
}
