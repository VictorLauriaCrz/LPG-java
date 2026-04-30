package ex02;

import java.util.Random;

public class Pedido {
    int numero;
    String data;
    item_Pedido[] item;
    int index;

    public Pedido(String data, int totalitems) {
        Random random = new Random();
        this.numero = random.nextInt(9000) + 1000;
        this.data = data;
        this.item = new item_Pedido[totalitems];
    }

    public void adicionaritem(item_Pedido itemPedido){
        if (index < item.length){
            item[index] = itemPedido;
            index++;
        }
    }
    public double valorTotal(){
        double total = 0;
        for (int i = 0; i < index; i++){
            total += item[i].totalParcial();
        }
        return total;
    }
}
