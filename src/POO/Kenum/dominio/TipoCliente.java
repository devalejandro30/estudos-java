package POO.Kenum.dominio;

public enum TipoCliente {
    // tipo constante
    // enumeração -> utiliza-se quando se tem uma escolha dentro de uma quantidade limitada de opções e é preciso
    // forçar o tipo a ser utilizado
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
// }
    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
