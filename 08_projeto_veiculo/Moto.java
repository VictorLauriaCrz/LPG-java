public class Moto extends Veiculo{
    private int numCilindradas;

    public Moto(String placa, String marca, int numCilindradas){
        super(placa, marca);
        this.numCilindradas = numCilindradas;
    }

    public String toString(){
        String aux = super.toString();
        aux += "Numero de cilindradas: " +numCilindradas;
        return aux;
    }

}