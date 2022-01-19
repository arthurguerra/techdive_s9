package conta_bancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Agencia {

    private List<Conta> contas = new ArrayList<>();

    public void adiciona(Conta c) {
        this.contas.add(c);
    }

    public int getQuantidadeDeContas() {
        return this.contas.size();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta buscaPorTitular(String nomeDoTitular) {
        nomeDoTitular = nomeDoTitular.trim().toLowerCase();
        Conta conta = null;
        for(Conta c: this.contas) {
            if(c.getTitular().getNome().trim().toLowerCase().equals(nomeDoTitular)) {
                conta = c;
            }
        }
        return conta;
    }
}
