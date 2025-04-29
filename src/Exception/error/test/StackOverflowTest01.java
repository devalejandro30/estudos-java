package Exception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    // metodo recursivo
    // erro -> acontece na JVM, que provavelmente não será recuperado em tempo de execução
    // solução: arrumar o código
    public static void recursividade(){
        recursividade();
    }
}
