package POO.polimorfismo.exemplo2.dominio;

// classe abstrata não pode virar um objeto, só serve
// para efeitos de herança
// polimorfismo -> fazer uma determinada coisa com mesmo nome e essa coisa
// poder agir de maneiras diferentes

public abstract class Animal {

    private float peso;
    private int idade;
    private int membros;

    public abstract void locomover();
    public abstract void alimentar ();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
