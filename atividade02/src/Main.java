import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto alface = new Produto("10111", "Alface", 1, "Verde", 3, 1);
        int x;
        System.out.printf("Como deseja realizar o pagamento? Opções: 1 para pix, 2 para espécie, 3 para debito e 4 para credito: ");
        x = sc.nextInt();
        int parcelas;
        double dinheiro;
        switch (x){
            case 1:
                Pagamento emPix = new Pagamento("pix", alface.getValor());
                System.out.println("Valor a ser pago: " + String.format("%.2f", emPix.getValorProduto()));
                break;
            case 2:
                Pagamento emEspecie = new Pagamento("especie", alface.getValor());
                System.out.println("Valor recebido: ");
                dinheiro = sc.nextDouble();
                emEspecie.setValorRecebido(dinheiro);
                if (dinheiro >= emEspecie.getValorProduto()) {
                    emEspecie.calculaTroco();
                    System.out.println("Troco de: " + emEspecie.getTroco());
                } else{
                    System.out.println("Valor insuficiente para compra. Venda cancelada.");
                }
                break;
            case 3:
                Pagamento emDebito = new Pagamento("debito", alface.getValor());
                break;
            case 4:
                Pagamento emCredito = new Pagamento("credito", alface.getValor());
                System.out.println("Digite a quantidade de parcelas (1-3): ");
                parcelas = sc.nextInt();
                if (parcelas < 1 || parcelas > 3) {
                    System.out.println("Operação não pode ser realizada.");
                } else {
                    emCredito.setQtdParcelas(parcelas);
                    System.out.println(parcelas + "parcelas de " + emCredito.getValorProduto());
                }
                break;
        }




        }
    }