package exericio01;

public class Conta {
    // atributos ou propriedades ou variaveis de instância
    int numero;
    double saldo;
    String correntista;

    //metodo para depositar o valor
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    // método para sacar um valor
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
}
