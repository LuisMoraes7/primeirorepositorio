import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        int controleRepeat = 1;
        int x;
        do {
            System.out.printf("Digite 1 para cadastrar um aluno no sistema; digite 2 para cadastrar um professor; digite 3 para fechar o programa: ");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.printf("Digite o nome do aluno: ");
                    String nomeAluno = scName.nextLine();
                    System.out.printf("Digite a idade do aluno: ");
                    int idadeAluno = sc.nextInt();
                    System.out.printf("Digite a nota 1 do aluno: ");
                    double n1 = sc.nextDouble();
                    System.out.printf("Digite a nota 2 do aluno: ");
                    double n2 = sc.nextDouble();
                    Aluno a = new Aluno(nomeAluno, idadeAluno, n1, n2);
                    a.mySituation();
                    break;

                case 2:
                    System.out.printf("Digite o nome do professor: ");
                    String nomeProfessor = scName.nextLine();
                    System.out.printf("Digite a idade do professor: ");
                    int idadeProfessor = sc.nextInt();
                    Professor p = new Professor(nomeProfessor, idadeProfessor);
                    System.out.println("Salário: " + p.getSalario());
                    break;
                default:
                    System.out.println("Até mais!");
            }




            System.out.printf("Deseja continuar? Digite 0 para sim e qualquer outro número para não: ");
            controleRepeat = sc.nextInt();

        } while(controleRepeat == 0);
        System.out.println("Até mais!");
    }
}