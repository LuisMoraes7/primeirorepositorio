import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String codigo;
        String nome;
        double peso;
        String cor;
        double valor;
        int qtdEstoque;
        int parcelas;
        double dinheiro;
        int y;

        System.out.printf("Código: ");
        codigo = sc.next();
        System.out.printf("Nome: ");
        nome = sc.next();
        System.out.printf("Peso: ");
        peso = sc.nextDouble();
        System.out.printf("Cor: ");
        cor = sc.next();
        System.out.printf("Valor: ");
        valor = sc.nextDouble();
        System.out.printf("Quantidade no estoque: ");
        qtdEstoque = sc.nextInt();
        Produto p1 = new Produto(codigo, nome, peso, cor, valor, qtdEstoque);
        System.out.printf("Digite 1 para realizar o pagamento e 2 para fechar o programa: ");
        y = sc.nextInt();
        switch (y) {
            case 1:
                System.out.printf("Como deseja realizar o pagamento? Opções: 1 para pix, 2 para espécie, 3 para debito e 4 para credito: ");
                x = sc.nextInt();
                switch (x){
                    case 1:
                        Pagamento emPix = new Pagamento("pix", p1.getValor());
                        System.out.println("Valor a ser pago: " + String.format("%.2f", emPix.getValorProduto()));
                        break;
                    case 2:
                        Pagamento emEspecie = new Pagamento("especie", p1.getValor());
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
                        Pagamento emDebito = new Pagamento("debito", p1.getValor());
                        break;
                    case 4:
                        Pagamento emCredito = new Pagamento("credito", p1.getValor());
                        System.out.println("Digite a quantidade de parcelas (1-3): ");
                        parcelas = sc.nextInt();
                        if (parcelas < 1 || parcelas > 3) {
                            System.out.println("Operação não pode ser realizada.");
                        } else {
                            emCredito.setQtdParcelas(parcelas);
                            System.out.println(parcelas + " parcelas de " + emCredito.getValorProduto());
                        }
                        break;
                }
                break;
            default:
                System.out.println("Finalizando programa..");
                break;
        }

    }
}
