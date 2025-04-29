package POO.leituradedados.desafios;

import java.util.Scanner;

// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela
// a soma entre A e B e mostre se a soma é menor que C
public class Programa1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int resultado = somarInteiro(A, B);
        System.out.println("A soma é "+ resultado);
        compararC(C, resultado);
        input.close(); // fechar o scanner
    }

    public static int somarInteiro(int A, int B) {
        return A + B;
    }

    public static void compararC(int C, int resultado) {
        if (resultado < C) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println(" A soma de A e B é maior que C");
        }
    }
}
