public class Aluno {
    String nome;
    double n1;
    double n2;

    double media;

    boolean status;

    boolean naFinal;

    public boolean isNaFinal() {
        return naFinal;
    }

    public void setNaFinal(boolean naFinal) {
        this.naFinal = naFinal;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia() {
        this.media = (getN1() + getN2())/2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    void statusGeral(){
        if (getMedia() >= 7.0){
            setStatus(true);
            setNaFinal(false);
        } else if (getMedia() < 4.0){
            setStatus(false);
            setNaFinal(false);
        } else{
            setNaFinal(true);
        }
    }

    void mySituation(){
        statusGeral();
        System.out.println("Nome: " + getNome());
        System.out.println("Média: " + getMedia());
        if (isNaFinal()){
            System.out.println("Está na final.");
        } else{
            if (isStatus()){
                System.out.println("Aluno está aprovado");
            } else {
                System.out.println("Aluno está reprovado.");

            }
        }
    }
}
