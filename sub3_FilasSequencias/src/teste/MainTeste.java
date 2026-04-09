package teste;

import Filas.Filas1;

public class MainTeste {
    public static void main(String[] args) {
        Filas1 fila = new Filas1();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        fila.enqueue(44);
        if (fila.isEmpty()){
            System.out.println("Fila vazia");
        }else {
            System.out.println("Valor retirado da fila: " +fila.dequeue());
        }
        while ((!fila.isEmpty())){
            System.out.println("valor retirado da fila " +fila.dequeue());
        }
        System.out.println("Valor retirado da fila " + fila.dequeue());
    }
}
