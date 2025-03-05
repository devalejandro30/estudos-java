package POO.metodos.test;

import POO.metodos.dominio.Calculadora;

public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTeste4");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
