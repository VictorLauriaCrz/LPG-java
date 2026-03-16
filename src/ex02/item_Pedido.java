package ex02;

public class item_Pedido {
    String produto;
    double valor;
    int qtdComprado;

    public item_Pedido(String produto, double valor, int qtdComprado){
        this.produto = produto;
        this.valor = valor;
        this.qtdComprado = qtdComprado;
    }

    public double totalParcial(){
        return valor = qtdComprado;
    }
}
