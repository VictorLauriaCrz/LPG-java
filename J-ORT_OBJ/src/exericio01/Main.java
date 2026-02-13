package exericio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();

        System.out.println("Correntista -->");
        conta.correntista = sc.next();
        conta.numero = rd.nextInt(1000, 9999);

        conta.depositar(1000);
        System.out.println(conta.saldo);


        conta.sacar(750);
        System.out.println(conta.saldo);
    }
}
