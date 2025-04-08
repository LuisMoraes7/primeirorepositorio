
public final class Aluno extends Pessoa {
    double n1;
    double n2;
    double media;
    boolean status;
    boolean naFinal;
    CARGO cargo;

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public Aluno(String nome, int idade, double n1, double n2) {
        super(nome, idade);
        this.n1 = n1;
        this.n2 = n2;
        this.setMedia();
        this.statusGeral();
    }

    @Override
    public void responsabilidade() {
        System.out.println("Estou estudando...");
    }

    public boolean isNaFinal() {
        return this.naFinal;
    }

    public void setNaFinal(boolean naFinal) {
        this.naFinal = naFinal;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia() {
        this.media = (this.getN1() + this.getN2()) / (double)2.0F;
    }

    public double getN1() {
        return this.n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return this.n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", media=" + media +
                ", status=" + status +
                ", naFinal=" + naFinal +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    void statusGeral() {
        if (this.getMedia() >= (double)7.0F) {
            this.setStatus(true);
            this.setNaFinal(false);
        } else if (this.getMedia() < (double)4.0F) {
            this.setStatus(false);
            this.setNaFinal(false);
        } else {
            this.setNaFinal(true);
        }

    }

    void mySituation() {
        this.statusGeral();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Média: " + this.getMedia());
        if (this.isNaFinal()) {
            System.out.println("Está na final.");
        } else if (this.isStatus()) {
            System.out.println("Aluno está aprovado");
        } else {
            System.out.println("Aluno está reprovado.");
        }

    }
}