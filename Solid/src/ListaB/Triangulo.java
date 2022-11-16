package ListaB;

public class Triangulo {

    double altura;
    double base;

    public double calcularArea() {

        setAltura();
        setBase();
        System.out.println("A base do triangulo é " + getBase() + " A altura do triangulo é " + getAltura());
        System.out.println("A area do triangulo é " + (getBase()*getAltura())/2);

        return base * altura / 2;
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

