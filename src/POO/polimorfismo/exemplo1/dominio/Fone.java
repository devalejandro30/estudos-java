package POO.polimorfismo.exemplo1.dominio;

public class Fone extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.05;

    private String dataValidade;
    public Fone(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculasImposto() {
        System.out.println("Calculando imposto do Fone");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
