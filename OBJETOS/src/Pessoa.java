public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
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


    void fazAniversario(){
        System.out.println("Fiz aniversário!");
        idade++;
    }

    void apresentacao(){
        System.out.println("Ola! Meu nome é " + getNome() + "! Tenho " + getIdade() + " anos!");
    }
}
