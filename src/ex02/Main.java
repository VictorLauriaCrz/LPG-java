package ex02;

public class Main {
    public static void main(String[] args) {
        //gerando 3 items
        item_Pedido item1 = new item_Pedido("mouse", 50, 3);
        item_Pedido item2 = new item_Pedido("mouse", 50, 3);
        item_Pedido item3 = new item_Pedido("mouse", 50, 3);

        // gerando dois pedidos
        Pedido pedido1 = new Pedido("16/03/2026", 2);
        pedido1.adicionaritem(item1);
        pedido1.adicionaritem(item2);

        Pedido pedido2 = new Pedido("20/01/2026", 1);
        pedido2.adicionaritem(item2);

         Cliente cliente = new Cliente("Selmini", 1223, 2 );
         cliente.adicionarPedido(pedido1);
         cliente.adicionarPedido(pedido2);
         
    }
}
