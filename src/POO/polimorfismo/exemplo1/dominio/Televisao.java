package POO.polimorfismo.exemplo1.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculasImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
