package interfaces;

public class ReprodutorMusical extends Iphone {
   public void tocar(){
         System.out.println("Tocando música");
   }
   public void pausar(){
         System.out.println("Pausando música");
   }
   public void selecionarMusica(String musica){
         System.out.println("Selecionando a música: " + musica);
   }
}
