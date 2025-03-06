package POO.modificadorstatic.teste;

import POO.modificadorstatic.dominio.Carro;

public class CarroTeste1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Ferrari", 275);
        Carro carro3 = new Carro("Audi R8", 290);

        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
