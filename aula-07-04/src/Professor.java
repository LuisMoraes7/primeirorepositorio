
public final class Professor extends Pessoa {
    private double salario;
    public CARGO cargo;

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void responsabilidade(){
        System.out.println("Estou ensinando...");
    }

    public Professor(String nome, int idade) {
        super(nome, idade);
        this.calculaSalario();
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculaSalario() {
        this.salario = (double)12000.0F;
        this.setSalario(this.salario);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
