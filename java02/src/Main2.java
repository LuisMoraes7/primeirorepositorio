import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe o nome: ");
        String nome = sc.next();
        System.out.print("Informe a altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e " + altura + "m de altura.");
        System.out.println("==============");

    }
}
