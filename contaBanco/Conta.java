package bootcampJava.contaBanco;
public class Conta{

private double saldo;
private int numero;
private String agencia;
private String nomeCliente;
private double chequeEspecial;
private boolean usouChequeEspecial;

public void setSaldo(double saldo) {
   this.saldo = saldo;
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

public String getNomeCliente() {
   return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
   this.nomeCliente = nomeCliente;
}

public void setChequeEspecial(double chequeEspecial) {
   this.chequeEspecial = chequeEspecial;
}

public Conta(int numero, String agencia, String nomeCliente, double saldo) {
   this.usouChequeEspecial = false;
   this.numero = numero;
   this.agencia = agencia;
   this.nomeCliente = nomeCliente;
   this.saldo = saldo;
   criarChequeEspecial();
}

public double consultarSaldo(){
   return this.saldo;
}
public double consultarChequeEspecial(){
   return this.chequeEspecial;
}
public void depositar(double valor){
   this.saldo+=valor;
}
public void sacar(double valor){
   this.saldo-=valor;
}

public void criarChequeEspecial(){
   if(this.saldo<=500){
      this.chequeEspecial = 50;
   }
   else{
      this.chequeEspecial = (this.saldo * 0.5) + this.saldo;
   }
}


public void pagarBoleto(long codigoDeBarras, double valor) throws SaldoInsuficienteException{
   double valorGastoCheque;
   if (this.saldo>=0) valorGastoCheque = valor - this.saldo;
   else valorGastoCheque = valor;
   if (valor>this.saldo){
      if(this.saldo>0.00){
         if(valorGastoCheque<=this.chequeEspecial){
          this.saldo = 0.00;
          this.chequeEspecial -= valorGastoCheque;
          this.usouChequeEspecial = true;
          taxaChequeEspecial(valorGastoCheque);    
         }
         else{
            throw new SaldoInsuficienteException("Saldo insuficiente para pagar o boleto.");
         }
      }
      else{
          if(valorGastoCheque<=this.chequeEspecial){
          this.chequeEspecial -= valorGastoCheque;    
          this.usouChequeEspecial = true;
          taxaChequeEspecial(valorGastoCheque);    
         }
         else{
            throw new SaldoInsuficienteException("Saldo insuficiente para pagar o boleto.");
         }
      }
   }
   else{
      this.saldo-=valor;
   }
}

public double taxaChequeEspecial(double valorUsado){
   double taxa=0.00;
  if (this.usouChequeEspecial) taxa = valorUsado * 0.2;
  return taxa;
}

}