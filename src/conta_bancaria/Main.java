package conta_bancaria;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Arthur Guerra");
        ContaCorrente cc1 = new ContaCorrente(cliente1);

        Cliente cliente2 = new Cliente("João Victor");
        ContaCorrente cc2 = new ContaCorrente(cliente2);

        Cliente cliente3 = new Cliente("Fernando Emilio");
        ContaCorrente cc3 = new ContaCorrente(cliente3);

        Cliente cliente4 = new Cliente("Cezar Abascal");
        ContaPoupanca cp1 = new ContaPoupanca(cliente4);

        Cliente cliente5 = new Cliente("Elder");
        ContaPoupanca cp2 = new ContaPoupanca(cliente5);

        Agencia agencia = new Agencia();
        System.out.println(agencia.getQuantidadeDeContas());
        agencia.adiciona(cc1);
        agencia.adiciona(cc2);
        agencia.adiciona(cc3);
        agencia.adiciona(cp1);
        agencia.adiciona(cp2);
        System.out.println(agencia.getQuantidadeDeContas());

        System.out.println(agencia.buscaPorTitular("Cezar Abascal"));
        System.out.println(agencia.buscaPorTitular("   arthur guerra       "));
        System.out.println(agencia.buscaPorTitular("FERNANDO EMILIO"));
    }
}
