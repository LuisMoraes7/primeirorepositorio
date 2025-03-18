package praticando;

public class Moto extends Veiculo{
    int qtdCelindradas;

    public Moto(String marca, int qtdCelindradas) {
        super(marca);
        this.qtdCelindradas = qtdCelindradas;
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Quantidade de portas: " + this.qtdCelindradas);
    }
}
