package bootcampJava.herancaEpolimorfismo;
/*para os de meia entrada o seu valor deve ser 
 de metade do valor,  */
public non-sealed class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, int dubladoOuLegendado) {
        super(valor, nomeFilme, dubladoOuLegendado);
    }
    
    @Override
    public double valorIngresso() {
        return this.valor/2; // Retorna metade do valor do ingresso
    }
    
    public String toString() {
        return "MeiaEntrada{" +
                "valor=" + valorIngresso() +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", audio=" + dubladoOuLegendado +
                '}';
    }
}
