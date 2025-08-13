package bootcampJava.list;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
   public static void main (String [] args ){
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
     /*Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API 
para ordenar a lista de números em ordem crescente e a exiba no console. */
    numeros.stream().sorted().forEach(System.out::println);
    /*Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números 
pares da lista e exiba o resultado no console. */
    System.out.println(numeros.stream().filter(n->n%2==0).reduce(0, Integer::sum)); //0 indica valor inicial
    /*Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os 
números da lista são positivos e exiba o resultado no console. */
    numeros.stream().filter(n->n<0).findFirst()
    .ifPresentOrElse(
        y -> System.out.println("ha algum elemento que nao eh positivo"),
        () -> System.out.println("todos os elementos sao positivos")
    );

   }
}