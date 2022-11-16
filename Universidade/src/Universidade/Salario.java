package Universidade;

public class Salario implements Reembolso {

    public static void Reajuste(Professor professor) {
    }

    public static void Reajuste(Estagiario funcionarioAdm) {
    }

    public static void Reajuste() {
    }

    public void aumentoSalarial(Funcionario funcionario, double aumento) {
        funcionario.setSalario(funcionario.getSalario() + (aumento * funcionario.getSalario()));
    }

    @Override
    public String getBolsaEstagio() {
        return null;
    }
}

