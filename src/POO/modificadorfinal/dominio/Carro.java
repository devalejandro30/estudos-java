package POO.modificadorfinal.dominio;

// public final class Carro -> a classe não pode ser estendida
// exemplo de classe final <String>
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // constante
    public final Comprador COMPRADOR = new Comprador(); // a referência é imutável

    public final void imprime(){  // metodo não pode ser sobrescrito
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
