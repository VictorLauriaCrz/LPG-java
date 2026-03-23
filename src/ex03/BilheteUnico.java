package ex03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    final static double tarifaBase = 5.4;
    usuario usuario;

    public BilheteUnico(usuario usuario) {
        this.numero = gerarNumero();
        this.saldo = 0;
        this.usuario = usuario;
    }

    public int gerarNumero() {
        Random random = new Random();
        return random.nextInt(1000, 9999);
    }

    public void carregar(double valor) {
        this.saldo += valor;
    }

    public double calcularTarifa() {
        double valor = tarifaBase / 2;
        if (usuario.tipotarifa.equalsIgnoreCase("comun")){
            valor = tarifaBase;

        }        return valor;
    }

    public boolean passarNaCatraca() {
        double valor = calcularTarifa();
    if (saldo < valor){
        return false;
    }
        saldo -= valor;
        return true;
    }

}
