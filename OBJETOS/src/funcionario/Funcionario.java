public class Funcionario {
    int matricula;
    String nome;
    double salarioBruto;
    double inss = 0.15;


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        setSalarioLiquido(salarioBruto);
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    private void setSalarioLiquido(double salarioBruto) {
        this.salarioLiquido = (salarioBruto - (salarioBruto * inss));
    }

    double salarioLiquido;

    void resumo(){
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome completo: " + getNome());
        System.out.println("Salário Bruto: " + getSalarioBruto());
        System.out.println("Dedução INSS: " + inss);
        System.out.println("Salário Líquido " + getSalarioLiquido());
    }


}
