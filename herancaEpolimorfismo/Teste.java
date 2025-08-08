package bootcampJava.herancaEpolimorfismo;

public class Teste {
    public static void main(String[] args) {
        MeiaEntrada meiaEntrada = new MeiaEntrada(20.0, "Avatar", 1);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(20.0, "Avatar", 2, 4);
        System.out.println("MEIA ENTRADA: "+meiaEntrada);
        System.out.println("INGRESSO FAMILIA: " + ingressoFamilia);
    }
}
