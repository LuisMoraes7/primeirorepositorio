public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, int idade) {
        super(nome, idade);
        calculaSalario();
    }

    public Professor(){}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculaSalario(){
        salario = 300 * 40;
        setSalario(salario);
    }
}
