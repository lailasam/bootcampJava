package bootcampJava.list;
/*nome, matricula e nota */
public class Aluno {
long matricula;
double media;
String nome;
public Aluno(long matricula, double media, String nome) {
    this.matricula = matricula;
    this.media = media;
    this.nome = nome;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
        return false;
    return true;
}
@Override
public String toString() {
    return "Aluno{" +
            "matricula=" + matricula +
            ", media=" + media +
            ", nome='" + nome + '\'' +
            '}';
}
}
