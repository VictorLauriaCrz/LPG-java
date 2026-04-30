package br.fiap.util;
import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class Util {

    private Viagem viagem = new Viagem();

    public void menu() {
        int opcao;
        do {

            String aux = "Reserva de carga\n ";
            aux += " [1] Reservar\n ";
            aux += " [2] Pesquisar\n ";
            aux += " [3] Visualizar reservas\n ";
            aux += " [4] Capacidade reservada\n ";
            aux += " [5] Cancelar reserva\n ";
            aux += " [6] Finalizar\n ";
            opcao = parseInt(showInputDialog(aux));
            if (opcao > 1 || opcao > 6){
                showMessageDialog(null, "errou o baugulho aí");
            }

            else{
                switch(opcao){
                    case 1:
                        reservar();
                        break;
                    case 4:
                        capacidadeReservas();
                        break;
                }
            }
        }
        while (opcao !=6);
    }

    private void capacidadeReservas() {
        showMessageDialog(null, "Capacidade atual: " +viagem.capacidadeReservar());
    }

    private void reservar() {
        int cnpj;
        String destino, nomeCliente;

        cnpj = parseInt(showInputDialog("CNPJ"));
        destino = showInputDialog("Destino da carga");
        nomeCliente = showInputDialog("Destino do cliente");

        Cliente cliente = new Cliente(cnpj, nomeCliente);
        Carga carga = new Carga(destino, cliente);
        if (viagem.reservar(carga)){
            showMessageDialog(null, "Carga reservada com sucesso");
        }
        else {
            showMessageDialog(null, "Entre em contato com a administração");
        }

    }

}
