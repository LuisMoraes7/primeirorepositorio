package revisaoInterface;

public class Professor extends Pessoa implements Folha{
    private double salario;

    public Professor(String nome, int idade) {
        super(nome, idade);
        calculaSalario();
    }

    @Override
    public String toString() {
        return "revisaoInterface.Professor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Professor(){}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void responsabilidade() {
        System.out.println("Ensinar");
    }

    public void calculaSalario(){
       double tot = 40 *150;
        System.out.println(tot);
    }
}
