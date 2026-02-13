
public class Aula_1 {
    // atributos ou prorpiedades ou variáveis d instãncia = (objeto)
    int rm;
    double nota1;
    double nota2;
    String nome;
    String curso;

    public double calcularMedia(){
        double media;
        media = (nota1 + nota2) / 2;
        return media;



    }

    public String status() {
        if(calcularMedia() >= 6){
            return "Aprovado";
        }
        return "Reprovado";
    }
}
