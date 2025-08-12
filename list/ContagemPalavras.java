package bootcampJava.list;

import java.util.HashMap;
import java.util.Map;

/*Crie uma classe chamada "ContagemPalavras" que 
utilize um Map para armazenar as palavras e a quantidade
 de vezes que cada palavra aparece em um texto. 
 Implemente os seguintes métodos:
adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem. */
public class ContagemPalavras {
Map<String, Integer> contagemPalavras;
public ContagemPalavras(){
    this.contagemPalavras = new HashMap<>();
}
public void adicionarPalavra(String palavra, Integer contagem){
    contagemPalavras.put(palavra, contagem);
}
public void removerPalavra(String palavra){
    contagemPalavras.remove(palavra);
}
public Map<String, Integer> exibirContagemPalavras() {
    return new HashMap<>(contagemPalavras);
}
public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
    Map.Entry<String, Integer> palavraMaisFrequente = null;
    for (Map.Entry<String, Integer> p : contagemPalavras.entrySet()) {
        if (palavraMaisFrequente == null || p.getValue() > palavraMaisFrequente.getValue()) {
            palavraMaisFrequente = p;
        }
    }
    return palavraMaisFrequente;
}
}
