package Repeticao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
       /* int count = 12;
        while(count < 10){
            System.out.println(count);
            count ++;
        } do {
            System.out.println("dentro do do-while");
        } while (count < 10);

        for (int i=0; i < 10; i++){
            System.out.println("For" +i);
        }
        */

        // Imprima todos os números pares de 0 - 10^6
       /* for (int i=1; i <= 1000000; i ++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */

        // Imprima os primeiros 25 números de um dado valor. Ex: 50
        int valorMax = 50;
        for (int a = 0; a <= valorMax ; a++) {
            System.out.println(a);
            if(a == 25){
                break;
            }
            System.out.println(a);
        }
        // dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000;
       double valorTotal = 30000;
       /* for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }
        */
        // continue
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }

}
