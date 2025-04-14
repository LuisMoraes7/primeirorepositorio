package atv1;

public class Main {
    public static void main(String[] args) {
        Pessoa m = new Medico();
        Pessoa p = new Paciente();
        p.setNome("Daniel");
        p.setIdade(19);
        m.setNome("Paulo");
        m.setIdade(37);
        System.out.println(m);
        m.responsabilidade();
        System.out.println(p);
        p.responsabilidade();
    }
}
