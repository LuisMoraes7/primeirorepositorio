package atv1;

public class Paciente extends Pessoa{
    String doenca;
    @Override
    public void responsabilidade() {
        System.out.println("Ser atendido");
    }

}
