package exercicio4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        System.out.println("Eu sei dividir");
        do {
            System.out.println("Informe o primeiro valor: ");
            try {
                int x = Integer.parseInt(sc.nextLine());
                System.out.println("Informe o segundo valor: ");
                int y = Integer.parseInt(sc.nextLine());
                int r = x/y;
                System.out.println("Resultado da divisão: "+r);
                repetir = false;
            } catch (NoSuchElementException noSuchElementException) {
                System.err.println("Nenhum valor foi informado!");
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Número inválido!");
            } catch (ArithmeticException arithmeticException) {
                System.err.println("Impossível dividir por zero!");
            }
        } while(repetir);
    }
}
