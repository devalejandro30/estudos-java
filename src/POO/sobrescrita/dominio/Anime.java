package POO.sobrescrita.dominio;

public class Anime extends Object {
    private String nome;

    // sobrescrita de métodos -> nome/quantidade de parâmetros precisa ser o mesmo
    // tipo de retorno ser exatamente a classe ou subclasse <modificador de acesso menos restritivo>

    @Override // pra ter ctz que o metodo está sendo sobrescrito
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
