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
        Scanner scNome = new Scanner(System.in);
        Scanner scCodigo = new Scanner(System.in);
        String cor;
        double valor;
        int qtdEstoque;
        int parcelas;
        double dinheiro;

        int y;

        int z = 0;
        do{
            System.out.printf("Digite 1 para cadastrar um produto e 2 para realizar o pagamento: ");
            y = sc.nextInt();

            switch (y){
                case 1:
                    System.out.printf("Código do produto: ");
                    codigo = scCodigo.nextLine();
                    System.out.printf("Nome do produto: ");
                    nome = scNome.nextLine();
                    System.out.printf("Peso do produto: ");
                    peso = sc.nextDouble();
                    System.out.printf("Cor do produto: ");
                    cor = sc.next();
                    System.out.printf("Valor do produto: ");
                    valor = sc.nextDouble();
                    System.out.printf("Quantidade do produto em estoque: ");
                    qtdEstoque = sc.nextInt();
                    Produto p1 = new Produto(codigo, nome, peso, cor, valor, qtdEstoque);
                    break;
                case 2:

                    System.out.printf("Como deseja realizar o pagamento? Opções: 1 para pix, 2 para espécie, 3 para debito e 4 para credito: ");
                    x = sc.nextInt();
                    System.out.println("Valor do produto: "+ p1.getValor());
                    switch (x){
                        case 1:
                            Pagamento emPix = new Pagamento("pix", alface.getValor());
                            System.out.println("Valor a ser pago: " + String.format("%.2f", emPix.getValorProduto()));
                            break;
                        case 2:
                            Pagamento emEspecie = new Pagamento("especie", alface.getValor());
                            System.out.printf("Valor recebido: ");
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
                                System.out.println(parcelas + " parcelas de " + emCredito.getValorProduto());
                            }
                            break;
                    }
                    break;
            }
            System.out.println("Digite 0 para voltar ao começo do programa e 1 para sair.");
            z = sc.nextInt();
        }while(z == 0);







        }
    }