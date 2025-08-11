package bootcampJava.list;

import java.util.ArrayList;
import java.util.List;

/*Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. 
O carrinho deve ser implementado como uma lista de itens. 
Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. 
Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço 
e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, 
levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades. */
public class CarrinhoDeCompras {
private List<Item> itens;
public CarrinhoDeCompras() {
    this.itens = new ArrayList<>();
}
public void adicionarItem(String nome, double preco, int quantidade) {
    itens.add(new Item (nome, preco, quantidade));
}
public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    for (Item i : itens) {
        if (i.getNome().equals(nome)) {
            itensParaRemover.add(i); //no caso de nome repetido, remove todos
        }
    }
    itens.removeAll(itensParaRemover);
}
public double calcularValorTotal() {
    double total = 0.0;
    for (Item i : itens) {
        total += i.getPreco() * i.getQuantidade();
    }
    return total;
}
public void exibirItens(){
    System.out.println("Itens no carrinho:"+itens);
}
}

