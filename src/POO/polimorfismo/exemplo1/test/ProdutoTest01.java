package POO.polimorfismo.exemplo1.test;

import POO.polimorfismo.exemplo1.dominio.Computador;
import POO.polimorfismo.exemplo1.dominio.Fone;
import POO.polimorfismo.exemplo1.dominio.Televisao;
import POO.polimorfismo.exemplo1.repsitory.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Fone fone = new Fone("JBL 520BT", 300 );
        Televisao televisao = new Televisao("LG 65\" ", 3000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(fone);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(televisao);
    }

}
