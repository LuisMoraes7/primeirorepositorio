
import java.io.PrintStream;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }


    public abstract void responsabilidade();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void fazAniversario() {
        System.out.println("Fiz aniversário!");
        ++this.idade;
    }

    void apresentacao() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Ola! Meu nome é " + var10001 + "! Tenho " + this.getIdade() + " anos!");
    }
}
