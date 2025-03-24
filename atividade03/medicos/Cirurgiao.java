package medicos;

public class Cirurgiao extends Medico{
    public void tratarPaciente(){
        System.out.println("Tratando paciente...");
    }

    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    public void fazerIncisao(){
        System.out.println("Fazendo incisão...");
    }
}
