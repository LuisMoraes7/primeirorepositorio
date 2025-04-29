import controller.ProfessorController;
import model.Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProfessorController pc1 = new ProfessorController();
        Professor p1 = new Professor();
        System.out.println("Digite o nome do professor: ");
        p1.setNome(scanner.next());
        System.out.println("Digite a idade do professor: ");
        p1.setIdade(scanner.nextInt());
        System.out.println("Digite a especialização do professor: ");
        p1.setEspecializacao(scanner.next());
        pc1.cadastrarProfessor(p1);
        System.out.println(pc1.listarProfessores());

        }
    }
