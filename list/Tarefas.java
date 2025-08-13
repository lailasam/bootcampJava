package bootcampJava.list;

public class Tarefas {
private String descricao;
public String getDescricao() {
    return descricao;
}
private boolean concluida;
public void setConcluida(boolean concluida) {
    this.concluida = concluida;
}
public boolean isConcluida() {
    return concluida;
}
public Tarefas(String descricao) {
    this.descricao = descricao;
    this.concluida = false;
}
@Override
public String toString() {
    return "Tarefa{" +
            "descricao='" + descricao + '\'' +
            ", concluida=" + concluida +
            '}';
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Tarefas other = (Tarefas) obj;
    if (descricao == null) {
        if (other.descricao != null)
            return false;
    } else if (!descricao.equals(other.descricao))
        return false;
    return true;
}

}
