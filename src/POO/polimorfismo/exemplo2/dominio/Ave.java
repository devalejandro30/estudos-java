package POO.polimorfismo.exemplo2.dominio;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Ave");
    }
    public void fazerNinho(){
        System.out.println("fazendo ninhos");
    }
}
