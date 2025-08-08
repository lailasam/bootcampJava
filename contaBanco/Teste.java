package bootcampJava.contaBanco;
import java.util.Scanner;
public class Teste {
    public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);
       Conta conta = new Conta(12345, "001", "João Silva", 1000.00);
       System.out.println(conta.consultarChequeEspecial());
       try {
        conta.pagarBoleto(79879879, 2500.00);
    } catch (SaldoInsuficienteException e) {
        System.out.println(e.getMessage());
    }
       System.out.println("Cheque "+conta.consultarChequeEspecial());
       System.out.println("Saldo "+conta.consultarSaldo());
       scanner.close();
    }
}
