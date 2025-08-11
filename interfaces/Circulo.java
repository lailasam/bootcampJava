package interfaces;

public class Circulo implements IForma {
double raio;
public Circulo(double raio) {
    this.raio = raio;
}
@Override
public double calcularArea() {
    return Math.PI * Math.pow(this.raio, 2);
}
public double getRaio() {
    return raio;
}

public void setRaio(double raio) {
    this.raio = raio;
}

}
