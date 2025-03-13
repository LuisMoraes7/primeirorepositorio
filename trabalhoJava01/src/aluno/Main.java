package aluno;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;
        System.out.printf("Nome do aluno: ");
        nome = scName.nextLine();
        System.out.printf("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.printf("Nota 2: ");
        nota2 = sc.nextDouble();

        Aluno a1 = new Aluno();
        a1.setNome(nome);
        a1.setNota1(nota1);
        a1.setNota2(nota2);
        a1.calculaMedia();
        System.out.println("aluno.Aluno "+ a1.getNome() + " está " + a1.getStatus());
    }
}