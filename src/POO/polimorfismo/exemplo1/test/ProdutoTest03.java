package POO.polimorfismo.exemplo1.test;

import POO.polimorfismo.exemplo1.dominio.Computador;
import POO.polimorfismo.exemplo1.dominio.Fone;
import POO.polimorfismo.exemplo1.dominio.Produto;
import POO.polimorfismo.exemplo1.repsitory.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000 );

        Fone fone = new Fone("Airpods Pro",2500);
        fone.setDataValidade("11/09/2025");

        CalculadoraImposto.calcularImposto(fone);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
