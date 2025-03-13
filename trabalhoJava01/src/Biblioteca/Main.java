package Biblioteca;

import Banco.UsuarioBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        Scanner scName2 = new Scanner(System.in);
        Scanner scName3 = new Scanner(System.in);
        int n = 0;
        int x;
        do{
            System.out.printf("Digite 1 para registrar um livro; 2 para registrar novo usuário; 3 para associar um livro a um usuário; 4 para devolver um livro; 5 para exibir os livros; qualquer outro número para finalizar o programa: ");
            x = sc.nextInt();
            switch (x){
                case 1:
                    Livro l1 = new Livro();
                    System.out.printf("Digite o nome do autor: ");
                    l1.setAutor(scName.nextLine());
                    System.out.printf("Digite o título do livro: ");
                    l1.setTitulo(scName2.nextLine());

                    break;
                case 2:
                    System.out.printf("Digite o nome do usuário: ");
                    Usuario u1 = new Usuario(scName3.nextLine());
                    break;
                case 3:

                    break;
                case 4:

                    break;
            }


            System.out.println("Deseja continuar? Digite 0 para sim.");
            n = sc.nextInt();
        } while (n == 0);
    }
}
