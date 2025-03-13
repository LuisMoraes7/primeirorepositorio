package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsuarioBanco user1 = new UsuarioBanco();
        UsuarioBanco user2 = new UsuarioBanco();

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int x;
        do{
            System.out.printf("Digite 1 para depositar; 2 para sacar; 3 para transferir dinheiro para outra conta; 4 para finalizar o programa: ");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite o valor que deseja depositar...");
                    user1.depositar(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar...");
                    user1.sacar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir...");
                    System.out.println("Conta do usuário 2:");
                    user2.depositar(user1.transferir(sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Finalizando programa.");
                    n = 1;
                    break;
            }


            System.out.println("Deseja continuar? Digite 0 para sim.");
            n = sc.nextInt();
        } while (n == 0);

        System.out.println("Fibalizando programa...");
    }
}
