public class Main {
    public static void main(String[] args) {
        int x = 0;
        do{
            System.out.println("Caso escolha");

            switch (x) {
                case 0:
                    System.out.println("Opção 0 escolhida");
                    break;
                case 1:
                    System.out.println("Opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } while(x == 0);


    }
}