package animais;

public class Animal {
    protected float tamanho;
    protected String cor;

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void comer(){
        System.out.println("Comendo");
    }
}
