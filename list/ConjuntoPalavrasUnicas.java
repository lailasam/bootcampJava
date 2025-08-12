package bootcampJava.list;

import java.util.HashSet;
import java.util.Set;

/*Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um 
conjunto de palavras únicas como atributo. 
Implemente os seguintes métodos:
adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remove uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto. */
public class ConjuntoPalavrasUnicas {
private Set<String> palavrasUnicas;
public ConjuntoPalavrasUnicas() {
    this.palavrasUnicas = new HashSet<>();
}
public void adicionarPalavra(String palavra) {
    palavrasUnicas.add(palavra);
}
public void removerPalavra(String palavra) {
    palavrasUnicas.remove(palavra);
}
public boolean verificarPalavra(String palavra) {
    return palavrasUnicas.contains(palavra);
}
public Set<String> exibirPalavrasUnicas() {
    return new HashSet<>(palavrasUnicas);
}
}
