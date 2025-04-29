package POO.polimorfismo.exemplo2.dominio;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentam-se de vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de réptil");
    }
}
