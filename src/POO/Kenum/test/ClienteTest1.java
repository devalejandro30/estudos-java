package POO.Kenum.test;

import POO.Kenum.dominio.Cliente;
import POO.Kenum.dominio.TipoPagamento;
import POO.Kenum.dominio.TipoCliente;

public class ClienteTest1 {
    private static TipoCliente tipoCliente;

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberto", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Eduardo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoClinte = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física221");
        System.out.println(tipoCliente2);

    }
}
