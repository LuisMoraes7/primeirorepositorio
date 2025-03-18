package praticando;

public class Carro extends Veiculo{
    int qtdPortas;

    public Carro(String marca, int qtdPortas) {
        super(marca);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Quantidade de portas: " + this.qtdPortas);
    }
}
