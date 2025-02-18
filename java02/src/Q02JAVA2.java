import java.util.Scanner;

public class Q02JAVA2 {
    public static void main(String[] args) {
        String matricula;
        double salarioBruto;
        String nome;
        double desconto = 0.15;
        double salarioLiquido;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("==============");
        System.out.print("Informe a matrícula: ");
        matricula = sc.next();
        System.out.print("Informe o nome: ");
        nome = sc2.nextLine();
        System.out.print("Informe o salário: ");
        salarioBruto = sc.nextDouble();

        salarioLiquido = salarioBruto - (salarioBruto * desconto);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Dedução INSS: " + desconto * 100 + "%");
        System.out.println("Salário líquido: " + salarioLiquido);

    }
}
