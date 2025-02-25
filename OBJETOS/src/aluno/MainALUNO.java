import java.util.Scanner;

public class MainALUNO {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner scName = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        a.setNome(scName.nextLine());
        System.out.print("Nota 1: ");
        a.setN1(sc.nextDouble());
        System.out.print("Nota 2: ");
        a.setN2(sc.nextDouble());

        a.setMedia();
        a.mySituation();

    }
}
