package Exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // checked e unchecked
        // RuntimeException -> erro de desenvolvimento
    }

    public static class RuntimeExceptionTest02 {
        public static void main(String[] args) {
            System.out.println( divisao(1, 0));
        }

        private static int divisao(int a, int b){
            if (b == 0){
                // lançando uma exceção
                throw new RuntimeException("Argumento errado, não pode divisão por zero");
            }
            return a/b;
        }
    }
}
