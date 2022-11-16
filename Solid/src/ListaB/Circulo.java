package ListaB;

public class Circulo implements FiguraGeometrica.figuraGeometrica {
    double raio;

    public double calcularArea() {
        setRaio(8);
        System.out.println("\nO raio do Circulo é de " + getRaio());
        System.out.println("A area do circulo é de " + 3.14*(getRaio()*getRaio()) );

        return 3.14 *(raio *raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

