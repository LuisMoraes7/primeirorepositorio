package produtos;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Banana", 3.95);
        System.out.println(p1.qtdEstoque);
        p1.addEstoque(32);
        p1.show();
        p1.venderProduto(11);
        p1.show();
    }
}
