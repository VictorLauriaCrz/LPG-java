public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, int numPortas) {
        super(placa, marca);
        this.numPortas = numPortas;
    }

    public String toString(){
        String aux = super.toString();
        aux += "Numero de portas: " +numPortas;
        return aux;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
