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
    }

}
