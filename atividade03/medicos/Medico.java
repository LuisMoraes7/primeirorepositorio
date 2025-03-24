package medicos;

public class Medico {
    public boolean trabalhaNoHospital;

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente(){
        System.out.println("Tratando paciente...");
    }
}
