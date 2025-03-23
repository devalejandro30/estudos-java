package POO.Minterfaces.test;

import POO.Minterfaces.dominio.DataLoader;
import POO.Minterfaces.dominio.DatabaseLoader;
import POO.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseloader.load();
        fileLoader.load();

        databaseloader.remove();
        fileLoader.remove();

        databaseloader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
