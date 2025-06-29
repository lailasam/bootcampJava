package bootcampJava.contaBanco;
public class ContaTerminal{
 private int numero;
 private String agencia;
 private String nomeCliente;
 private double saldo;

 public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
    setNumero(numero);
    setAgencia(agencia);
    setNomeCliente(nomeCliente);
    setSaldo(saldo);
 }

 public double getSaldo() {
    return saldo;
 }
 public void setSaldo(double saldo) {
    this.saldo = saldo;
 }
 public String getNomeCliente() {
    return nomeCliente;
}
 public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
 }
 public int getNumero() {
    return numero;
}
 public void setNumero(int numero) {
    this.numero = numero;
 } 
 public String getAgencia() {
    return agencia;
}
 public void setAgencia(String agencia) {
    this.agencia = agencia;
 }

public String toString(){
    return "Olá " + this.nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", " + "conta " + String.format("%d",this.numero )+ " e seu saldo " + String.format("%.2f", this.saldo) + " já está disponível para saque";
}

}