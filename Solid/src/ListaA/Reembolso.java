package ListaA;

public class Reembolso {
    private static String nome;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Reembolso.nome = nome;
    }

    public void calcular(Reembolso reembolso){

        System.out.println("Calculo do reembolso, "+Reembolso.getNome()+" no valor R$ ");

    }

}
