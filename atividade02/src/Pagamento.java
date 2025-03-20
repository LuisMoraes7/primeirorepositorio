import java.util.Scanner;

public class Pagamento {
    String tipo;
    int qtdParcelas;
    double valorRecebido;

    double troco;

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
        setValorProduto(getValorProduto()/qtdParcelas);
    }

    public double getTroco() {
        return troco;
    }

    public double calculaTroco(){
        setTroco(getValorRecebido() - getValorProduto());
        return getTroco();
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    double valorProduto;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }



    public Pagamento(String tipo, double valorProduto) {
        setTipo(tipo);
        if (getTipo().equals("pix") || getTipo().equals("especie") || getTipo().equals("debito")){
            setValorProduto(valorProduto * 0.95);
        } else{
            setValorProduto(valorProduto);
        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }



}
