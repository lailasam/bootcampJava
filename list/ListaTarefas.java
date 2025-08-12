package bootcampJava.list;

import java.util.HashSet;
import java.util.Set;

/*Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. 
Cada tarefa possui um atributo de descrição e 
um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:
adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas. */
public class ListaTarefas {
private Set<Tarefas> tarefas;
public ListaTarefas() {
    this.tarefas = new HashSet<>();
}
public void adicionarTarefa(String descricao) {
    tarefas.add(new Tarefas(descricao));
}
public void removerTarefa(String descricao) {
    tarefas.remove(new Tarefas(descricao));
}
public Set<Tarefas> exibirTarefas() {
    return new HashSet<>(tarefas);
}
public int contarTarefas() {
    return tarefas.size();
}
public Set<Tarefas> obterTarefasConcluidas() {
Set<Tarefas> tarefasConcluidas = new HashSet<>();
for (Tarefas t : tarefas) {
    if(t.isConcluida()) {
        tarefasConcluidas.add(t);
    }
}
return tarefasConcluidas;
}
public Set<Tarefas> obterTarefasPendentes() {
Set<Tarefas> tarefasPendentes = new HashSet<>();
for (Tarefas t : tarefas) {
    if(!t.isConcluida()) {
        tarefasPendentes.add(t);
    }
}
return tarefasPendentes;
}
public void marcarTarefaConcluida(String descricao){
    for (Tarefas t: tarefas){
        if(t.getDescricao().equals(descricao)) {
            t.setConcluida(true);
            break;
        }
    }
}
public void marcarTarefaPendente(String descricao){
    for (Tarefas t: tarefas){
        if(t.getDescricao().equals(descricao)) {
            t.setConcluida(false);
            break;
        }
    }
}
public void limparListaTarefas() {
    tarefas.clear();
}
}


