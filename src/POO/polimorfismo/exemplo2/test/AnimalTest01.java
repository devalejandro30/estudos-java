package POO.polimorfismo.exemplo2.test;

import POO.polimorfismo.exemplo2.dominio.Ave;
import POO.polimorfismo.exemplo2.dominio.Mamifero;
import POO.polimorfismo.exemplo2.dominio.Peixe;
import POO.polimorfismo.exemplo2.dominio.Reptil;

public class AnimalTest01 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();

        mamifero.setPeso(85.7f);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

    }
}
