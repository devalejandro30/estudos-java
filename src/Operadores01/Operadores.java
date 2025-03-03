package Operadores01;

public class Operadores {

    // + - / *
    // operadores lógicos < > <= >= == != -> retornam booleans

    /**
     *  && (AND)  || (or)  !
     *
     * && todas as condições precisam ser verdadeiras para o resultado final
     * seja true
     *
     */

    // operadores de atribuição = += -= *= /= %= ++ --

    public static void main(String[] args) {
        boolean comparacao = 10 == 15;
        System.out.println(comparacao);

        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPs5 = 5000F;
        boolean isPs5Compravel = valorContaCorrente > valorPs5 ||
                valorContaPoupanca > valorPs5;
        System.out.println("isPs5Compravel " + isPs5Compravel);

        // atribuição
        double bonus = 1800;
        bonus += 1000;      //bonus = bonus + 1000;
        System.out.println(bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++; // forma ainda mais abreviada
        int contador2 = 0;
        System.out.println(contador2++); // colocando dps ele primeiro
        // printa a variável e dps add +1
        System.out.println(contador2);

    }
}
