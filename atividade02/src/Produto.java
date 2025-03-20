public class Produto {
    String codigo;
    String nome;
    double peso;
    String cor;
    double valor;
    int qtdEstoque;

    public Produto(String codigo, String nome, double peso, String cor, double valor, int qtdEstoque) {
        setCodigo(codigo);
        setNome(nome);
        setPeso(peso);
        setCor(cor);
        setValor(valor);
        setQtdEstoque(qtdEstoque);
    }

    public int venda(int qtdSaida){
        setQtdEstoque(getQtdEstoque() - qtdSaida);
        return qtdEstoque;
    }

    public int chegadaEstoque(int qtdChegada){
        setQtdEstoque(getQtdEstoque() + qtdChegada);
        return qtdEstoque;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
