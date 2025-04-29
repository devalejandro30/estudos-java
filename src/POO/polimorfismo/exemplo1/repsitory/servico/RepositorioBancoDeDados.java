package POO.polimorfismo.exemplo1.repsitory.servico;

import POO.polimorfismo.exemplo1.repsitory.Repository;

public class RepositorioBancoDeDados implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
