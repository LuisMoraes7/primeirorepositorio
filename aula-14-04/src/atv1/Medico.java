package atv1;

public class Medico extends Pessoa{
    double salario;

    @Override
    public void responsabilidade() {
        System.out.println("Atender");
    }
}
