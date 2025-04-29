package POO.polimorfismo.exemplo1.test;

import POO.polimorfismo.exemplo1.dominio.Computador;
import POO.polimorfismo.exemplo1.dominio.Fone;
import POO.polimorfismo.exemplo1.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000 );
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculasImposto());
        System.out.println("-----------");

        Produto produto2 = new Fone("Airpods Pro",2500);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculasImposto());
    }
}
