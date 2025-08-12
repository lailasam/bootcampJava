package bootcampJava.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. 
Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:
adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto. */
public class GerenciadorAlunos {
Set<Aluno> alunos;
public GerenciadorAlunos() {
    this.alunos = new HashSet<>();
}
public void adicionarAluno(String nome, long matricula, double media) {
    alunos.add(new Aluno(matricula, media, nome));
}
public void removerAluno(long matricula) {
    Aluno alunoParaRemover = null;
    for (Aluno a : alunos) {
        if(matricula == a.matricula) {
            alunoParaRemover = a;
            break;
        }
    }
    if (alunoParaRemover != null) {
        alunos.remove(alunoParaRemover);
    }
}
public Set<Aluno> exibirAlunosPorNome() {
    Set<Aluno> alunosOrdenados = new TreeSet<>(alunos);
    return alunosOrdenados;
}
public Set<Aluno> exibirAlunosPorNota() {
    Set<Aluno> alunosOrdenados = new TreeSet<>(new AlunoNotaComparator());
    alunosOrdenados.addAll(alunos);
    return alunosOrdenados;
}
public Set<Aluno> exibirAlunos() {
    return new HashSet<>(alunos);
}
}
