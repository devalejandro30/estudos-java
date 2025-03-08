package POO.modificadorstatic.test;

import POO.modificadorstatic.domain.Carro;

public class CarroTest1 {
    // metodo estático, público, sem retorno, chamado main e recebe um array como argumento
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Ferrari", 275);
        Carro carro3 = new Carro("Audi R8", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
