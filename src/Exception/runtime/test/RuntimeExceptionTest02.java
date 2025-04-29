package Exception.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    // tratar a exceção é usar try e catch
    // lançar novas exceções <throws new> <objeto>
    // avisar outras pessoas colocar na assinatura do metodo depois do () throws <exceção> * incomum
    // runtime exception -> tratamento opcional

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if(b == 0){
        throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a/b;
    }
}