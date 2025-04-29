package POO.polimorfismo.exemplo1.repsitory.servico;

import POO.polimorfismo.exemplo1.dominio.Fone;
import POO.polimorfismo.exemplo1.dominio.Produto;

// regra de negócio
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calculasImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        // cast e instanceof
        if (produto instanceof Fone) {
            String dataValidade = ((Fone) produto).getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
