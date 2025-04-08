public final class Coordenador extends Pessoa{
    public CARGO cargo;
    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    @Override
    public void responsabilidade() {
        System.out.println("Estou coordenando...");
    }

    public Coordenador(String nome, int idade) {
        super(nome, idade);
    }
}
