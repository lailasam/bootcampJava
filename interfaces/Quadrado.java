package interfaces;

public class Quadrado implements IForma {
private double lado;
public Quadrado(double lado) {
    this.lado = lado;
}
@Override
public double calcularArea() {
    return Math.pow(this.lado, 2);
}

public double getLado() {
    return lado;
}
public void setLado(double lado) {
    this.lado = lado;
}
}
