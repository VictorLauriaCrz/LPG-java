package main;

import java.util.ArrayList;

import conta.Conta;
import corrente.ContaCorrente;
import poupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
      ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new ContaCorrente("12345", 1000.0, 500.0));
        lista.add(new ContaPoupanca("67890", 2000.0, 5.0));
 
        for(Conta conta : lista){
            System.out.println(conta);
            System.out.println(conta.getSaldoDisponivel());
            System.out.println();
        }

    }
}
