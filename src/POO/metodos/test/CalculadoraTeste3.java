package POO.metodos.test;

import POO.metodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("-------");
        calculadora.imprimeDivisaoDeDoisNumeros(30, 0);
    }
}
