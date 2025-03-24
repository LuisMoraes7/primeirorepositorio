package animais;

public class Leao extends Animal {
    private boolean juba;
    public void cacar(){
        System.out.println("Caçando");
    }

    public boolean isJuba() {
        return juba;
    }

    public Leao(boolean juba, String cor, float tamanho) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
}
