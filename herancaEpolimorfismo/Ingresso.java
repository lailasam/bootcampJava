package bootcampJava.herancaEpolimorfismo;
/* Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. 
O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. 
A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. 
Cada ingresso deve ter um método que retorna o seu valor real 
( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser 
 de metade do valor, 
 para os ingressos família deve-se retornar o valor multiplicado pelo 
 número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.*/
public sealed abstract class Ingresso permits MeiaEntrada, IngressoFamilia {
     protected double valor;
     protected String nomeFilme;
     protected Audio dubladoOuLegendado; //1-dublado 2-legendado

    public Ingresso(double valor, String nomeFilme, int dubladoOuLegendado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubladoOuLegendado = Audio.buscarPorValor(dubladoOuLegendado);
    }
    
    public abstract double valorIngresso(); 
    
}
