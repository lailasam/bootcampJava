package interfaces;

public class NavegadorInternet extends Iphone{
public void exibirPagina(String url) {
    System.out.println("Exibindo a página: " + url);
}
public void adicionarNovaAba(){
    System.out.println("Adicionando uma nova aba");
}
public void atualizarPagina() {
    System.out.println("Atualizando a página atual");
}
}
