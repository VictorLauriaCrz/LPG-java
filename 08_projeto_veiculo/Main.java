import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("ABC1234", "Toyota", 4));
        lista.add(new Moto("XYZ5678", "Honda", 150));
        lista.add(new Carro("DEF5678", "Ford", 2));

        for(Veiculo veiculo : lista){
            System.out.println(veiculo);
            System.err.println();
        }
    }
}