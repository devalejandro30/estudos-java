package POO.leituradedados.desafios;
//2 - Faça um algoritmo para receber um número qualquer e imprimir
// na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        parImpar(num);
        negativoPositivo(num);
        input.close();
    }
    public static void parImpar(int num){
        if (num % 2 == 0){
            System.out.println("O número "+num+" é par");
        } else {
            System.out.println("O número "+num+" é ímpar");
        }
    }

    public static void negativoPositivo(int num){
        if (num >= 0){
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }
}
