package bootcampJava.list;

public class Teste {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Maçã", 0.5, 10);
        carrinho.adicionarItem("Banana", 0.3, 5);
        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        carrinho.removerItem("Maçã");
        carrinho.exibirItens();

    SomaNumeros somaNumeros = new SomaNumeros();
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(20);
    somaNumeros.adicionarNumero(5);
    
    System.out.println("Soma: " + somaNumeros.calcularSoma());
    System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
    System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    System.out.println("Números na lista: " + somaNumeros.exibirNumeros());
    }

}
