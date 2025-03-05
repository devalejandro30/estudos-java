package POO.metodos.test;

import POO.metodos.dominio.Pessoa;

public class PessoaTeste1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
//        pessoa.imprime();]
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
