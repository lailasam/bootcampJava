package bootcampJava.list;

import java.util.ArrayList;
import java.util.List;

/*Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
Implemente os seguintes métodos:
adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class SomaNumeros {
private List<Integer> numeros;
public SomaNumeros(){
    this.numeros = new ArrayList<>();
}
public void adicionarNumero(int numero){
    numeros.add(numero);
}
public int calcularSoma(){
    int soma = 0;
    for (int n : numeros) {
        soma+=n;
    }
    return soma;
}
public int encontrarMaiorNumero(){
    int maior = Integer.MIN_VALUE;
    if(!numeros.isEmpty()){
        for (int n : numeros) {
            if(maior<n){
                maior = n;
            }
        }
    }
    return maior;
}
public int encontrarMenorNumero(){
    int menor = Integer.MAX_VALUE;
    if(!numeros.isEmpty()){
        for (int n : numeros) {
            if(menor>n){
                menor = n;
            }
        }
    }
    return menor;
}
public List<Integer> exibirNumeros(){
    return numeros;
}
}
