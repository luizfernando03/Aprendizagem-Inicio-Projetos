package ListaB;

public class Quadrado extends FiguraGeometrica {

    public double lado;

    public double calcularArea() {
        setLado();
        System.out.println("Lado do quadrado é " + getLado());
        System.out.println("A area do quadrado é :" + getLado()*getLado());

        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado() {
        this.lado = lado;
    }
}

