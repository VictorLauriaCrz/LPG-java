public class Veiculo {
    
    private String placa;
    private String marca;

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }
    
    public String toString(){
        String aux = "";
        aux += "Placa : " + placa + "\n";
        aux += "Marca: "  + marca +"\n";
        return aux;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
