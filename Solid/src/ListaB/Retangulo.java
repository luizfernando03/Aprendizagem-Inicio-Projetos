package ListaB;

public class Retangulo implements FiguraGeometrica.figuraGeometrica {

    double base;
    double altura;

    public double calcularArea() {
        setAltura();
        setBase();
        System.out.println("A base do retangulo é " + getBase() + " ,A altura é de " + getAltura());
        System.out.println("A area do retangulo é de " + getBase()*getAltura());
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase() {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura() {
        this.altura = altura;
    }
}
