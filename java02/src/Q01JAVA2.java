import java.util.Scanner;

public class Q01JAVA2 {
    public static void main(String[] args) {
    String x;
        do{
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("==============");
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe a idade: ");
            int idade = sc2.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Deseja repetir o programa? '0' para sim.");
            x = sc.next();
        } while(x.equalsIgnoreCase("0"));
        System.out.println("Finalizando programa...");
    }

}
