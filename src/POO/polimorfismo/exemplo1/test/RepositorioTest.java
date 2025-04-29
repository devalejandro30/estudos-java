package POO.polimorfismo.exemplo1.test;

import POO.polimorfismo.exemplo1.repsitory.Repository;
import POO.polimorfismo.exemplo1.repsitory.servico.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        Repository repository = new RepositorioArquivo();
        repository.salvar();
    }
}
