package revisaoInterface;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Professor();
        Pessoa c = new Coordenador();
        p.responsabilidade();
        c.responsabilidade();
        ((Professor)p).calculaSalario();
        ((Coordenador)c).calculaSalario();



    }
}