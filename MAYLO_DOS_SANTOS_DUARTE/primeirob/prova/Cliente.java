package MAYLO_DOS_SANTOS_DUARTE.primeirob.prova;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // private Endereco endereco;

    
}
