package produtos;

public class Produto {
    String nome;
    double preco;
    int qtdEstoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque += 1;
    }

    public void addEstoque(int qtd){
        this.qtdEstoque += qtd;
    }

    public void venderProduto(int qtd){
        this.qtdEstoque -= qtd;
    }

    public void show(){
        System.out.println("Estoque atual: " + this.qtdEstoque);
    }
}
