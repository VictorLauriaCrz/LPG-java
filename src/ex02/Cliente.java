package ex02;

public class Cliente {
    String nome;
    long cpf;
    Pedido[] pedido;
    int index;

    public Cliente(String nome, long cpf, int totalPedidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = new Pedido[totalPedidos];
    }

    public void adicionarPedido(Pedido pedido) {
        if (index < this.pedido.length) {
            this.pedido[index] = pedido;
            index++;
        }
    }
    public double total(){
        double valorTotal = 0;
        for (int i = 0; i < index; i++){
            valorTotal += pedido[i].valorTotal();
        }
        return valorTotal;
    }
}

