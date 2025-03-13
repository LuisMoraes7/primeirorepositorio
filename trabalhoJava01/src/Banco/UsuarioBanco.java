package Banco;

public class UsuarioBanco {
    double saldo;

    public UsuarioBanco() {
        this.saldo = 0;
    }

    public void show(){
        System.out.println("Saldo atual: " + this.saldo);

    }

    public void depositar(double money){
        System.out.println("Depositando " + money + " R$");
        this.saldo += money;
        show();

    }

    public void sacar(double money){
        if (money > this.saldo){
            System.out.println("Dinheiro requisitado maior que o disponível na conta.");
            show();
            return;
        }

        System.out.println("Sacando " + money + " R$");
        this.saldo -= money;
        show();
    }

    public double transferir(double money){
        System.out.println("Transferindo " + money + " R$");
        this.saldo -= money;
        return money;
    }
}
