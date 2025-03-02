package test;


import static test.Calculadora.somaDoisNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        int resultadoSoma = somaDoisNumeros(10, 20);
        System.out.println(resultadoSoma);

        // modificador static -> objeto não pode ser instanciado,
        // pois está sendo utilizado o objeto original
    }
}
