package bootcampJava.list;

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
@Override
public String toString() {
    return "Item{" +
            "nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            '}';
}
}
