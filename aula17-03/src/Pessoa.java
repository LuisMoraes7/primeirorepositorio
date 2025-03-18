public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){}

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


    void fazAniversario(){
        System.out.println("Fiz aniversário!");
        idade++;
    }

    void apresentacao(){
        System.out.println("Ola! Meu nome é " + getNome() + "! Tenho " + getIdade() + " anos!");
    }
}