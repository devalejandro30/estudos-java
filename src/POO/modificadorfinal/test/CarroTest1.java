package POO.modificadorfinal.test;

import POO.modificadorfinal.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
    Carro carro = new Carro();

    System.out.println (Carro.VELOCIDADE_LIMITE);
    System.out.println (carro.COMPRADOR);
    carro.COMPRADOR.setNome("Sasuke");
        System.out.println(carro.COMPRADOR);
    }
}

