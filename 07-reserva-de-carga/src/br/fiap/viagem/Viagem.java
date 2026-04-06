package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
    private int capacidade;
    private int index;
    private Carga[] carga;

    public Viagem(){
        this.capacidade = 10000;
        this.index = 0;
        this.carga = new Carga[20];
    }

    public boolean permitirReservar(double peso){
        double total = 0;
        for (int i = 0; i < index; i++){
        total += carga[i].getPeso();
        }
        return (total + peso) > capacidade;
    }
}
