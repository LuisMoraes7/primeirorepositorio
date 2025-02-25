import java.util.Scanner;

public class MainCALCULADORA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int n = 0;
        do{
            System.out.print("Digite o número 1: ");
            c.setN1(sc.nextInt());
            System.out.print("Digite o número 2: ");
            c.setN2(sc.nextInt());
            int x;
            System.out.println("Digite 1 para somar;");
            System.out.println("Digite 2 para subtrair;");
            System.out.println("Digite 3 para multiplicar;");
            System.out.println("Digite 4 para dividir;");
            x = sc.nextInt();
            switch (x){
                case 1:
                    c.somar();
                    break;
                case 2:
                    c.subtrair();
                    break;
                case 3:
                    c.multiplicar();
                    break;
                case 4:
                    c.dividir();
                    break;
            }
            if (x != 0){
                System.out.println("O resultado é: " + c.getTotal());
                System.out.println("Deseja reiniciar o programa? 0 para sim");
                n = sc.nextInt();
            } else{
                System.out.println("Opção inválida!");
                System.out.println("Deseja reiniciar o programa? 0 para sim");
                n = sc.nextInt();
            }
        } while (n == 0);

    }
}
