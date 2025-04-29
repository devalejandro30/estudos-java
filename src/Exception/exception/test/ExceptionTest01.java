package Exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");

        // tenta fazer isso:
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado "+isCreate);
        } catch (IOException e) {
            // não deixar em branco
            e.printStackTrace();
        }
    }
}
