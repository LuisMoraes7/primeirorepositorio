import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        int controleRepeat = 1;

        do {
//                    System.out.printf("Digite o nome do aluno: ");
//                    String nomeAluno = scName.nextLine();
//                    System.out.printf("Digite a idade do aluno: ");
//                    int idadeAluno = sc.nextInt();
//                    System.out.printf("Digite a nota 1 do aluno: ");
//                    double n1 = sc.nextDouble();
//                    System.out.printf("Digite a nota 2 do aluno: ");
//                    double n2 =
                    String nomeAluno = "Luís";
                    int idadeAluno = 19;
                    double n1 = 9;
                    double n2 = 9;
                    Aluno a = new Aluno(nomeAluno, idadeAluno, n1, n2);
                    System.out.println(a);
                    a.responsabilidade();
                    a.setCargo(CARGO.Aluno);
                    System.out.println("Cargo: " + a.getCargo());
//                    System.out.printf("Digite o nome do professor: ");
//                    String nomeProfessor = scName.nextLine();
//                    System.out.printf("Digite a idade do professor: ");
//                    int idadeProfessor = sc.nextInt();
                    String nomeProfessor = "Fernanda";
                    int idadeProfessor = 28;
                    Professor p = new Professor(nomeProfessor, idadeProfessor);
                    System.out.println(p);
                    p.responsabilidade();
                    p.setCargo(CARGO.Professor);

                    System.out.println("Cargo: " + p.getCargo());
                    Coordenador c = new Coordenador("matheus", 57);
                    c.setCargo(CARGO.Coordenador);
                    System.out.println("Cargo: "+ c.getCargo());
                    c.responsabilidade();
                    Disciplina d = new Disciplina();
                    d.ministrarDisciplina(p);
                    d.cadastrarAluno(a);
                    d.setNome("java");
                    System.out.println(d);

            System.out.printf("Deseja continuar? Digite 0 para sim e qualquer outro número para não: ");
            controleRepeat = sc.nextInt();
        } while(controleRepeat == 0);

        System.out.println("Até mais!");
    }
}

