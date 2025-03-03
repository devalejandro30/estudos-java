package POO.metodos.test;

import POO.metodos.dominio.Calculadora;

public class CalculadoraTeste1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste1");
        calculadora.subtraiDoisNumeros();
    }
}
