package bootcampJava.list;

public class Tarefas {
private String descricao;
public String getDescricao() {
    return descricao;
}
private boolean concluida;
public boolean isConcluida() {
    return concluida;
}
public Tarefas(String descricao) {
    this.descricao = descricao;
    this.concluida = false;
}
}
