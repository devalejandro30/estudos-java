package POO.polimorfismo.exemplo1.repsitory.servico;

import POO.polimorfismo.exemplo1.repsitory.Repository;

public class RepositorioArquivo implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
