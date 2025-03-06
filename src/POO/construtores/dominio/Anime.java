package POO.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int quantidadeEpisodios;
    private String genero;
    private String estudio;

    // construtor -> inicializa um objeto de uma determinada classe seguindo um padrão
    public Anime(String nome, String tipo, int quantidadeEpisodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeEpisodios = quantidadeEpisodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int quantidadeEpisodios, String genero, String estudio) {
        this(nome, tipo, quantidadeEpisodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.quantidadeEpisodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
