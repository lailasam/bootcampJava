package bootcampJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Crie uma classe chamada "OrdenacaoNumeros" 
que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:
adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando 
a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente
usando um Comparable e a class Collections. */
public class OrdenacaoNumeros {
private List<Integer> numeros;
public OrdenacaoNumeros() {
    this.numeros = new ArrayList<>();
}
public void adicionarNumero(int numero) {
    numeros.add(numero);
}

public List<Integer> ordenarAscendente(){
    List<Integer> numerosOrdenados = new ArrayList<>(numeros);
    Collections.sort(numerosOrdenados);
    return numerosOrdenados;
}
public List<Integer> ordenarDescendente(){
    List<Integer> numerosOrdenados = new ArrayList<>(numeros);
    Collections.sort(numerosOrdenados, Collections.reverseOrder());
    return numerosOrdenados;
}
}
