import java.util.Scanner;

public class MainFUNCIONARIO {
    public static void main(String[] args) {
        Scanner scName = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.print("Nome: ");
        f.setNome(scName.nextLine());
        System.out.print("Matrícula: ");
        f.setMatricula(sc.nextInt());
        System.out.print("Salário Bruto: ");
        f.setSalarioBruto(sc.nextDouble());
        f.resumo();
    }
}
