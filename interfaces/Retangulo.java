package interfaces;

public class Retangulo implements IForma{
    double base;
    double altura;


@Override
public double calcularArea(){
    return this.base * this.altura;
}
public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
}
