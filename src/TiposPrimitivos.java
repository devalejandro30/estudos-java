public class TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 20;  // esse valor se guarda em memória
        System.out.println("A idade é " + (age)+" anos"); // concatenação

        double salarioDouble = 2500;
        char caractere = 'a';
        System.out.println("Salário dos sonhos de um estagiário seria de: "+ (salarioDouble));
        // casting -> forçar a entrada de um valor maior numa variável de valor menor
        long numeroGrande = (long) 155.23; // exemplo de casting *(não é uma prática boa)
        System.out.println(numeroGrande);
        String nome = "Alejandro";
        System.out.println(nome);
        var nome1 = "Ana"; // forma de omitir o tipo da variável

        String nome2 = "Ale";
        String endereço = "Rua Felipe José da Silva";
        double salario = 1500;
        String data1 = "25/02/2025";

        System.out.println("Eu "+(nome2)+ " morando no endereço "+
                (endereço)+ ", confirmo que recebi o salário de "+
                (salario)+", na data "+ (data1));

         // modificadores de acesso
        /**
         * private -> informação só pode ser acessado somente
         * pela mesma classe
         *
         * protected ->
         *
         * default -> acessado no mesmo pacote
         * */
    }
}
