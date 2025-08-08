package bootcampJava.herancaEpolimorfismo;
/* para os ingressos família deve-se retornar o valor multiplicado pelo 
 número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.*/
public non-sealed class IngressoFamilia extends Ingresso {
    private int qntPessoas;
    public IngressoFamilia (double valor, String nomeFilme, int dubladoOuLegendado, int qntPessoas) {
        super(valor, nomeFilme, dubladoOuLegendado);
        this.qntPessoas = qntPessoas;

    }
    @Override
    public double valorIngresso() {
        return this.qntPessoas > 3 ? (this.valor*qntPessoas*0.95):(this.valor*qntPessoas);
    }

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }
    public String toString() {
        return "IngressoFamilia{" +
                "qntPessoas=" + qntPessoas +
                ", valor=" + valorIngresso() +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", audio=" + dubladoOuLegendado +
                '}';
    }
}
