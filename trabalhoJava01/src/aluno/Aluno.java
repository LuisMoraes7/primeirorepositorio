package aluno;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;
    public void calculaMedia(){
        media = (nota1 + nota2)/2;
        if (media >= 7.0){
            setStatus("aprovado");
        } else if (media < 4){
            setStatus("reprovado");
        } else{
            setStatus("na final");
        }
    }

}
