package POO.Minterfaces.dominio;

public interface DataLoader {
    // todos os atributos por padrão são constantes
    public static final int MAX_DATA_SIZE = 10;  // redundante
    // tipo um contrato
    // nas interfaces os métodos por padrão são public e abstract
    void load();
    default void checkPermission(){
        System.out.println("Checagem de permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
