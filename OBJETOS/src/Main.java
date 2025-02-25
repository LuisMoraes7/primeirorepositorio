import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);

        Pessoa person = new Pessoa(scName.nextLine(), sc.nextInt());


        person.apresentacao();
        person.fazAniversario();
        person.apresentacao();


    }


}