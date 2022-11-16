package Universidade;

public class Rembolso<Reembolso> extends Salario {
    public void calcular(Reembolso   reembolso) {
        System.out.println("Calculando o reembolso para, " + Rembolso.getNome() + " no valor de R$ ...");
    }

    private static String getNome() {
        return null;
    }
}
