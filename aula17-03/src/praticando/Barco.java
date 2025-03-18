package praticando;

public class Barco extends Veiculo{
    int potMotor;

    public Barco(String marca, int potMotor) {
        super(marca);
        this.potMotor = potMotor;
    }

    @Override
    public void resumo() {
        super.resumo();
        System.out.println("Quantidade de portas: " + this.potMotor);
    }
}
