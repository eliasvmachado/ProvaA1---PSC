package primeiraProva;

import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pecasCompradas = 11; //estou assumindo o que disse na questão a: o numero de pecas sera contado pelo carrinho
        double[] precos = new double[pecasCompradas]; 

        for(int i = 0; i < pecasCompradas; i++) {
            System.out.println("Digite o valor da " + (i+1) + " peça: ");
            double valor = scanner.nextDouble();
            
            precos[i] = valor; 
        }
        
        double total = 0;
        for (double preco : precos) {
            total += preco; 
        }

        double desconto = 0;
        if (pecasCompradas > 10) {
            desconto = 0.1;
        }
        
        
        double valorComDesconto = total * (1 - desconto); 

        System.out.println("Valor total da compra: R$" + total);
        System.out.println("Valor total da compra com desconto: R$" + String.format("%.2f", valorComDesconto));

        scanner.close();
    }
}