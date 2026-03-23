package ex03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[3];
    static Scanner sc = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("[1]. Cadastrar bilhete");
            System.out.println("[2]. Carregar bilhete");
            System.out.println("[3]. Consultar saldo");
            System.out.println("[4]. Passar catraca");
            System.out.println("[5]. Finalizar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consultarSaldo();
                case 4 -> passarNaCatraca();
                case 5 -> System.out.println("Até breve");
                default -> System.out.println("opção inválida");
            }
        } while (opcao != 5);
    }

    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (index < bilhete.length){
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("CPF: ");
            cpf = sc.nextLong();
            System.out.print("Tipo de Tarifa (estudante | professor | comum: ");
            tipoTarifa = sc.next();
            bilhete[index] = new BilheteUnico(new usuario(nome, cpf, tipoTarifa));
            index ++;
        }
    }

public static BilheteUnico pesquisar(){
    long cpf;
    System.out.println("CPF para pesquisar: ");
    cpf = sc.nextLong();

    for(int i = 0; i < index; i++){
        if (bilhete[i].usuario.cpf == cpf){
            return bilhete[i];
            }
        }

    System.out.println("bilhete não encontrado");
    return null;
    }

    public static void carregar(){
        double valor;
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            System.out.print("valor da recarga");
            valor = sc.nextDouble();
            bilheteUnico.carregar(valor);
        }
    }

    private static void passarNaCatraca(){
        BilheteUnico bilheteUNico = pesquisar();
        if (bilheteUNico != null){
            if (!bilheteUNico.passarNaCatraca()){
                System.out.println("Saldo insuficiente");
            }
            System.out.println("saldo atual R$ " +bilheteUNico.saldo);
        }
    }

    private static void consultarSaldo(){
    BilheteUnico bilheteUnico = pesquisar();
    if (bilheteUnico != null){
        System.out.println("Saldo atual" +bilheteUnico.saldo);
    }

    }
}

