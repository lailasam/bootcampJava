package bootcampJava.list;
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
public class Item {
private String nome;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
private double preco;
public double getPreco() {
    return preco;
}
public void setPreco(double preco) {
    this.preco = preco;
}
private int quantidade;
public int getQuantidade() {
    return quantidade;
}
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
}
