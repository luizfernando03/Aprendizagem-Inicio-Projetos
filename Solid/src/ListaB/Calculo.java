package ListaB;

public class Calculo {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.calcularArea();


        Retangulo retangulo = new Retangulo();
        retangulo.calcularArea();


        Triangulo triangulo = new Triangulo();
        triangulo.calcularArea();


        Circulo circulo = new Circulo();
        circulo.calcularArea();

    }
}