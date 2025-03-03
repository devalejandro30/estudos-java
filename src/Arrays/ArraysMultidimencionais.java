package Arrays;

public class ArraysMultidimencionais {
    public static void main(String[] args) {
        // array dentro de outro array
        // funcionalidade? armazenar dados em várias dimensões,
        // organizando-os em estruturas de matrizes

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("---------");

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }

        // variáveis de referência inicializam com null

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        // tamanho base do array [3] c/ 3 arrays 

        for (int[] arrBase : arrayInt) {
            System.out.println("\n-----");
            for (int numeros : arrBase) {
                System.out.print(numeros + " ");
            }
        }
    }
}
