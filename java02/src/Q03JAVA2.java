import java.util.Scanner;

public class Q03JAVA2 {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);
        double nota;
        double allNotas = 0;
        int qtdNotas = 0;
        double media;
        do{
            System.out.print("Insira uma nota do aluno: ");
            nota = sc.nextDouble();
            allNotas += nota;
            qtdNotas += 1;
            System.out.print("Deseja continuar? 'S' para sim e 'N' para não: ");
            x = sc.next();
        }while(x.equalsIgnoreCase("S"));
        media = allNotas/qtdNotas;
        System.out.println("Média das " + qtdNotas + " notas: " + media);
        System.out.println("Obrigado por usar o programa!");
    }
}
