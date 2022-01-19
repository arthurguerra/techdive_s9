package conta_bancaria;

import java.util.Scanner;

public abstract class Conta {

    private Cliente titular;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Conta " +
                "\n  Titular = " + titular + "\n";
    }
}
