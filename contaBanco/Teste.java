package bootcampJava.contaBanco;
import java.util.Scanner;
public class Teste {
    public static void main (String [] args){
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o seu nome:");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o numero da agencia:");
        agencia = sc.nextLine();
        System.out.println("Digite o numero da conta:");
        numero = sc.nextInt();
        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();
        sc.close();
        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(conta.toString());
    }
}
