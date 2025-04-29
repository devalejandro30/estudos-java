package POO.polimorfismo.exemplo1.repsitory.servico;

import POO.polimorfismo.exemplo1.repsitory.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
