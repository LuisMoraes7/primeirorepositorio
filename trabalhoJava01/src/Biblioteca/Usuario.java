package Biblioteca;

public class Usuario {
    String nome;
    double id;

    public Usuario(String name) {
        this.id = Math.random();
        setNome(name);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
