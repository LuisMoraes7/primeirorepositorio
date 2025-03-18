package praticando;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner scName = new Scanner(System.in);
            int controleRepeat = 1;
            int x;
            do {
                System.out.printf("Digite 1 para cadastrar um Veiculo qualquer no sistema; digite 2 para cadastrar um carro; digite 3 para cadastrar uma moto; digite 4 para cadastrar um barco; digite 5 para fechar o programa: ");
                x = sc.nextInt();
                switch (x){
                    case 1:
                        System.out.printf("Digite a marca do Veículo: ");
                        String marcaVec = scName.nextLine();
                        Veiculo v = new Veiculo(marcaVec);
                        v.resumo();
                        break;

                    case 2:
                        System.out.printf("Digite a marca do carro: ");
                        String marcaCarro = scName.nextLine();
                        System.out.printf("Digite a quantidade de portas: ");
                        int qtdPortas = sc.nextInt();
                        Carro c = new Carro(marcaCarro, qtdPortas);
                        c.resumo();
                        break;
                    case 3:
                        System.out.printf("Digite a marca da moto: ");
                        String marcaMoto = scName.nextLine();
                        System.out.printf("Digite a quantidade de celindradas: ");
                        int qtdCelind = sc.nextInt();
                        Moto m = new Moto(marcaMoto, qtdCelind);
                        m.resumo();
                        break;
                    case 4:
                        System.out.printf("Digite a marca do barco: ");
                        String marcaBarco = scName.nextLine();
                        System.out.printf("Digite a potencia do barco: ");
                        int potencia = sc.nextInt();
                        Barco b = new Barco(marcaBarco, potencia);
                        b.resumo();
                        break;
                    default:
                        System.out.println("Encerrando o programa..");
                }




                System.out.printf("Deseja reiniciar? Digite 0 para sim e qualquer outro número para não: ");
                controleRepeat = sc.nextInt();

            } while(controleRepeat == 0);
            System.out.println("Até mais!");
        }
    }

