package bootcampJava.list;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. 
Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, 
utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. 
A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", 
implemente os seguintes métodos:
adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria. */
public class LivrariaOnline {
Map<String, Livro> livros;
public LivrariaOnline() {
    this.livros = new HashMap<>();
}
public void adicionarLivro(String link, String titulo, String autor, double preco){
    livros.put(link, new Livro(titulo, autor, preco));
}
public void removerLivro(String titulo){
    String key = null;
    for (Map.Entry<String, Livro> l: livros.entrySet()) {
        if(l.getValue().getTitulo().equals(titulo)) {
            key = l.getKey();
            break;
        }
    }
    if(key != null) {
        livros.remove(key);
    }
}
public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    Map<String, Livro> livrosOrdenados = new TreeMap<>();
    return livrosOrdenados;
} //precisa do comparator e array list e linkedhashmap
}
