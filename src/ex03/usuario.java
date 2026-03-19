package ex03;

public class usuario {
    String nome;
    long cpf;
    String tipotarifa;

    public usuario(String tipotarifa, long cpf, String nome) {
        this.tipotarifa = tipotarifa;
        this.cpf = cpf;
        this.nome = nome;
    }
}
