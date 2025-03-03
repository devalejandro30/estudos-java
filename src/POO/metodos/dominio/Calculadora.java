package POO.metodos.dominio;

public class Calculadora {

    // estrutura atributos -> <modificador de acesso> <tipo> <nome/identificador>
    // estrutura métodos -> <modificador de acesso> <retorno> <nomeDoMetodo> (){}

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    // parâmetros <tipo> <identificador>
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }

}
