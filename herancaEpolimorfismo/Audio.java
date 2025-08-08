package bootcampJava.herancaEpolimorfismo;

public enum Audio {
    DUBLADO (1),
    LEGENDADO (2);
    private final int valor;
    Audio (int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
    public static Audio buscarPorValor(int valor) {
        for (Audio tipoAudio : Audio.values()) {
            if (tipoAudio.getValor() == valor) {
                return tipoAudio;
            }
        }
        throw new IllegalArgumentException("Tipo de áudio inválido: " + valor);
    }
}
