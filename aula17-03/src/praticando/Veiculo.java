package praticando;

public class Veiculo {
    String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void resumo(){
        System.out.println("Marca: " + this.marca);
    }
}
