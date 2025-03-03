package POO.classes.test;

import POO.classes.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Lamborghini";
        carro1.modelo = "Lamborghini Aventador";
        carro1.ano = 2011;

        System.out.println("marca: "+ carro1.marca+"\n"+ "modelo: "+ carro1.modelo+"\n" +
                "ano: "+ carro1.ano+"\n");

        Carro carro2 = new Carro();
        carro2.marca = "Porsche";
        carro2.modelo = "Porsche 911";
        carro2.ano = 1963;
        System.out.println("marca: "+ carro2.marca+"\n"+ "modelo: "+ carro2.modelo+"\n" +
                "ano: "+ carro2.ano+"\n");
    }
}
