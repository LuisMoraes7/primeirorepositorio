package revisaoInterface;

public class Coordenador extends Pessoa implements Folha{
    double salario;
    int bon = 90;
   public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void responsabilidade() {
        System.out.println("Coordenar");
    }

    public void calculaSalario(){
        double tot = 40000 + bon;
        System.out.println(tot);
    }
}
