public class Calculadora {
    double n1;
    double n2;

    public double getTotal() {
        return total;
    }

    double total;
    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    void somar(){
        total = getN1() + getN2();
    }

    void subtrair(){
        total = getN1() - getN2();
    }

    void dividir(){
        total = getN1()/getN2();
    }

    void multiplicar(){
        total = getN1() * getN2();
    }


}
