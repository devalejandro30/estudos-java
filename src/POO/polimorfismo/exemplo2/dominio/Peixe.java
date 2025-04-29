package POO.polimorfismo.exemplo2.dominio;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Peixe");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
}
